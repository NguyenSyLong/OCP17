package OCP17.chapter13.LiveNess;

import java.util.concurrent.Executors;

public class DeadLock {


}

class Food {}
class Water {}
record Fox(String name) {
    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println(name() + " Got Food!");
            move();
            synchronized (water) {
                System.out.println(name() + " Got Water!");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println(name() + " Got Water!");
            move();
            synchronized (food) {
                System.out.println(name() + " Got Food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100); // Mô phỏng di chuyển
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // Tạo tài nguyên và đối tượng
        var foxy = new Fox("Foxy");
        var tails = new Fox("Tails");
        var food = new Food();
        var water = new Water();

        // Tạo thread pool
        var service = Executors.newScheduledThreadPool(10);
        try {
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        } finally {
            service.shutdown();
        }
    }
}
