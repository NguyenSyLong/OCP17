package OCP17.chapter13.concurrencyApi;

import java.util.concurrent.*;

public class ExecuteAndSubmit {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> {
//            System.out.println("Task is Running");
        });
        Future<?> future = executorService.submit(() -> {
            return "abv";
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
