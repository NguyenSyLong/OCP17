package OCP17.chapter13.lockFramework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class CycliccBarriers {
    private void removeLions() { System.out.println("Removing lions"); }
    private void cleanPen()    { System.out.println("Cleaning the pen"); }
    private void addLions()    { System.out.println("Adding lions"); }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {

        try {
            removeLions();
            c1.await();
            cleanPen();
            c1.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(4);
        try {
            var manager = new CycliccBarriers();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1, c2));
        } finally {
            service.shutdown();
        }
    }
}