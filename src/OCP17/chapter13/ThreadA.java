package OCP17.chapter13;


import java.text.ParseException;

public class ThreadA {
    public static void main(String[] args) throws ParseException {
        Runnable printInventory = () -> System.out.println("Print");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("a: " + i);
            }
        };

        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.println("end");
    }
}
