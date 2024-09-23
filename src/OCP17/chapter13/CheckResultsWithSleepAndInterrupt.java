package OCP17.chapter13;

public class CheckResultsWithSleepAndInterrupt {
    private static int counter = 0;

    public static void main(String[] args) {
        final var mainThread = Thread.currentThread();
        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter ++;
            }
            mainThread.interrupt();
        }).start();
        while (counter < 1_000_000) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1_000);
            } catch (Exception e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: " +counter);
    }
}
