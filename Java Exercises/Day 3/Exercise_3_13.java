class Exercise_3_13 {

    synchronized void worker1() {

        System.out.println("Worker1 started");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker1 ended");
    }

    synchronized void worker2() {
        System.out.println("Worker2 started");
        System.out.println("Worker2 ended");
        notify();
    }

    public static void main(String[] args) {

        Exercise_3_13 obj = new Exercise_3_13();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker2();
            }
        });

        t1.start();
        t2.start();
    }
}
