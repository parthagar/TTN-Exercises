import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Exercise_3_16 {
    public static void main(String[] args) throws InterruptedException {
        Exercise_3_16 t = new Exercise_3_16();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.worker2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    Lock l1 = new ReentrantLock(true);
    Lock l2 = new ReentrantLock(true);

    void acquireLock(Lock m, Lock n) {
        boolean a = m.tryLock();
        boolean b = n.tryLock();
        if (a && b) {
            return;
        }
        if (a) {
            m.unlock();
        }
        if (b) {
            n.unlock();
        }
    }

    void worker1() {
        acquireLock(l1, l2);
        System.out.println("lock1-worker1");
        System.out.println("lock2-worker1");
        l2.unlock();
        l1.unlock();
    }

    void worker2() {
        acquireLock(l2, l1);
        System.out.println("lock2-worker2");
        System.out.println("lock1-worker2");
        l1.unlock();
        l2.unlock();
    }
}