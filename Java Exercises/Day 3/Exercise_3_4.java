import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Exercise_3_4 {
    public static void main(String[] args) {
        ExecutorService e = Executors.newSingleThreadExecutor();
        try{
            e.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running thread 1");
                }
            });
            e.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running Thread 2");
                }
            });
            e.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(4000L);
                        System.out.println("Running Thread 3");
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }
        finally {
            e.shutdownNow();
        }
    }
}

