package OCP17.chapter13.concurrencyApi.schedulingTasks;

import java.util.concurrent.*;

public class Executor {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        Runnable task1 = () -> System.out.println("Hello zoo");
//        Callable<String> task2 = () -> "monkey";
//
//        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
//        ScheduledFuture<?> r2 = service.schedule(task2, 8, TimeUnit.MINUTES);

        service.scheduleAtFixedRate(() -> System.out.println("check animal health"), 5, 1, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(() -> System.out.println("check animal delay"), 0, 2, TimeUnit.SECONDS);
    }
}
