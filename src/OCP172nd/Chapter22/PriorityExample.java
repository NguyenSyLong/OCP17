package OCP172nd.Chapter22;

public class PriorityExample implements Runnable {
    private String threadName;

    public PriorityExample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " is running.");
    }

    public static void main(String[] args) {
        Thread lowPriorityThread = new Thread(new PriorityExample("LowPriority"));
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        Thread highPriorityThread = new Thread(new PriorityExample("HighPriority"));
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        Thread normalPriorityThread = new Thread(new PriorityExample("NormalPriority"));
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);

        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }


}
