import java.util.concurrent.atomic.AtomicInteger;

class Exercise_3_12 {
    AtomicInteger c = new AtomicInteger();

    void increment(){
        c.incrementAndGet();
    }
    void worker1(){
        for(int i =0;i<100;i++){
            increment();
        }
    }
    void worker2(){
        for(int i =0;i<100;i++){
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Exercise_3_12 x = new Exercise_3_12();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 running");
                x.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 running");
                x.worker2();
            }
        });

        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println(x.c);
    }
}
