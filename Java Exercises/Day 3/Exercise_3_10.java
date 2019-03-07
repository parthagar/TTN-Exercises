class Exercise_3_10 {
    int c = 0;

    synchronized void increment() {
        c++;
    }

    void worker1() {
        for (int i = 0; i < 100; i++) {
            increment();
        }
    }

    void worker2() {
        for (int i = 0; i < 100; i++) {
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Exercise_3_10 x = new Exercise_3_10();
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
