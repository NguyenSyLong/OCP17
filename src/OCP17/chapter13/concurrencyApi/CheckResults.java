package OCP17.chapter13.concurrencyApi;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 10; i++) {
                    counter++;
                }
            });
            result.get(10, TimeUnit.NANOSECONDS);
            System.out.println("Reach!");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}
