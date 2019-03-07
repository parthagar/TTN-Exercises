import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Exercise_3_8 {
    public static void main(String[] args) {
        ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
        e.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed after 1 second");
            }
        }, 1, TimeUnit.SECONDS);
        e.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task for sheduled at fixed rate");
            }
        }, 0, 2, TimeUnit.SECONDS);

        e.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task for sheduled at fixed delay");
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
}
