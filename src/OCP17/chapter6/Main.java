package OCP17.chapter6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getWalkSpeed());
    }
}


interface Carnivore {
    default void eatMeat() {

    }

}
interface Walk {
    default int getSpeed() { return 5; }
}

interface Run {
    default int getSpeed() { return 10; }
}

class Cat implements Walk, Run {
    public int getSpeed() { return 1; }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}
