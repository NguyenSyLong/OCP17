package OCP172nd.Chapter22;

public class WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        MessageDisplay md = new MessageDisplay();
        Thread t1 = new Thread(() -> { while (true) md.setMessage("Hi!"); }, "t1");
        t1.setDaemon(true);
        t1.start();
        Thread t2 = new Thread(() -> { while (true) md.setMessage("Howdy!"); }, "t2");
        t2.setDaemon(true);
        t2.start();
        Thread t3 = new Thread(() -> { while (true) md.displayMessage(); }, "t3");
        t3.setDaemon(true);
        t3.start();
        Thread t4 = new Thread(() -> { while (true) md.displayMessage(); }, "t4");
        t4.setDaemon(true);
        t4.start();
        Thread.sleep(5000);
        System.out.println("Exit from main.");
    }
}

class MessageDisplay {
    private String message;

    public synchronized void displayMessage() {
        String threadName = Thread.currentThread().getName();
        while (this.message == null) {                           // No message?
            try {
                wait();                                              // (1)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + ": " + this.message);    // Display message.
        this.message = null;                                     // Remove message.
        notifyAll();                                             // (2)
    }

    public synchronized void setMessage(String message) {
        String threadName = Thread.currentThread().getName();
        while (this.message != null) {                           // Message present?
            try {
                wait();                                              // (3)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;                                  // Set new message.
        System.out.println(threadName + ": Message set is " + this.message);
        notifyAll();                                             // (4)
    }
}
