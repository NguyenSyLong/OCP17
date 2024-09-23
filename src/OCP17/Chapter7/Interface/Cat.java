package OCP17.Chapter7.Interface;

public class Cat implements Walk,Run {
    @Override
    public int getSpeed() {
        return 1;
    }
}

 interface Walk {
    public default int getSpeed() { return 5; }
}

 interface Run {
    public default int getSpeed() { return 10; }
}

