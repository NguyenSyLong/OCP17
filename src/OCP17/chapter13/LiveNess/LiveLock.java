package OCP17.chapter13.LiveNess;

public class LiveLock {
    static class Person {
        private boolean move;

        public void move(boolean decision) {
            this.move = decision;
        }

        public boolean isMoving() {
            return move;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        Thread t1 = new Thread(() -> {
            while (true) {
                if (person2.isMoving()) {
                    System.out.println("Person 1: Waiting for Person 2...");
                    person1.move(false);
                } else {
                    System.out.println("Person 1: Moving forward!");
                    person1.move(true);
                }
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                if (person1.isMoving()) {
                    System.out.println("Person 2: Waiting for Person 1...");
                    person2.move(false);
                } else {
                    System.out.println("Person 2: Moving forward!");
                    person2.move(true);
                }
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        t1.start();
        t2.start();
    }
}
