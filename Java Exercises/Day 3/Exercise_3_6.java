import java.util.concurrent.*;

class Exercise_3_6 {
    public static void main(String[] args) {
        ExecutorService e = Executors.newSingleThreadExecutor();
        Future<Integer> f = e.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 1;
            }
        });
        e.shutdown();
        if (f.isDone()) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e1) {
                e1.printStackTrace();
            }
        }
        if (f.isCancelled()) {
            System.out.println("Task cancelled");
        }
    }
}
