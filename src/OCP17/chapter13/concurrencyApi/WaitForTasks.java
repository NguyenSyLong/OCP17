package OCP17.chapter13.concurrencyApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaitForTasks {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try{
        service.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task 1 done");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        service.submit(() -> {
            System.out.println("Task 2 done");
        });
        } finally {
            service.shutdown();
        }
        if (service.awaitTermination(3, TimeUnit.SECONDS)) {
            System.out.println("All tasks finished");
        } else {
            System.out.println("At least one task is still running");
        }
    }
}
