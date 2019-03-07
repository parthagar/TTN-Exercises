class thread1_1 implements Runnable {

    public void run() {
        System.out.println("Running thread1");
    }
}


class thread1_2 extends Thread {
    public void run() {
        System.out.println("Running thread2");
    }

}

class Exercise_3_1 {

    public static void main(String[] args) {
        new Thread(new thread1_1()).start();

        new thread1_2().start();
    }

}