package OCP172nd.Chapter22;

public class Counter extends Thread{
    private int currentValue = 0;

    public Counter() {
        this.currentValue = 0;
    }

    @Override
    public void run() {
        while (this.currentValue < 5) {
            System.out.printf("%s: %s%n",
                    super.getName(),    // In tên luồng
                    this.currentValue++); // In giá trị hiện tại và tăng
            try {
                Thread.sleep(500); // Luồng ngủ 500ms
            } catch (InterruptedException e) {
                System.out.println(super.getName() + " interrupted.");
            }
        }
        System.out.println("Exiting " + super.getName());
    }
}
