package OCP17.Chapter7.Interface;

public interface IsColdBlooded {
    boolean hasScale();
    default double getTemperature() {
        System.out.println("The " + " project " + hasScale());
        return 10;
    }
}
