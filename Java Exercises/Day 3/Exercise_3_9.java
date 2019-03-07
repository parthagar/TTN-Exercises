import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Exercise_3_9 {
    public static void main(String[] args) {
        ExecutorService e1 = Executors.newCachedThreadPool();
        ExecutorService e2 = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 12; i++) {
            e1.submit(new x(i));
        }
        e1.shutdown();

        for (int i = 0; i < 12; i++) {
            e2.submit(new x(i));
        }
        e2.shutdown();

    }
}

class x implements Runnable {
    private final int id;

    x(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread Name " + Thread.currentThread().getName() + " id is " + id);
    }
}