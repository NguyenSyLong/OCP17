package OCP17.chapter13;

public class Zoo {
    public static void pause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread finished !");
        }
    }

    public static void main(String[] args) {
        var job = new Thread(()-> pause());
        job.setDaemon(true);
        job.start();
        System.out.println("Main method finished!");
    }
}
