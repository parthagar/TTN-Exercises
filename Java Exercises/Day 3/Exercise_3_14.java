class Exercise_3_14 {
    public static void main(String[] args) {

        Exercise_3_14 obj = new Exercise_3_14();

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
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker3();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

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
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker2 ended");
    }

    synchronized void worker3() {
        System.out.println("Worker3 started");
        notifyAll();
        System.out.println("Worker3 ended");

    }
}
