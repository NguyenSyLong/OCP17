package OCP172nd.Chapter22;

public class CreateThread extends Thread {
    CreateThread(String name) {
        super(name);  // Gọi constructor của Thread để đặt tên cho luồng.
    }

    public void run() throws IllegalThreadStateException {
        System.out.println(Thread.currentThread().getName());
        throw new IllegalThreadStateException();  // Ném ngoại lệ.
    }

    public static void main(String[] args) {
        new CreateThread("|T1|").start();
    }

}
