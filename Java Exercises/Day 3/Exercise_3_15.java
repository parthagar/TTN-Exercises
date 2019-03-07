import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Exercise_3_15{

    Lock l = new ReentrantLock(true);
    Condition c = l.newCondition();

    void worker1() {
        l.lock();
        System.out.println("worker 1 Started");
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        l.unlock();
        System.out.println("worker 1 Finished");
    }

    void worker2() {
        l.lock();
        System.out.println("worker 2 Started");
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        l.unlock();
        System.out.println("worker 2 Finished");
    }

    void worker3() {
        l.lock();
        System.out.println("worker 3 Started");
        System.out.println("worker 3 Finished");
        c.signalAll();
        //c.signal();
        l.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Exercise_3_15 x = new Exercise_3_15();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.worker2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.worker3();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t3.join();
        t2.join();
    }


}
