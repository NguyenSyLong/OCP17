package OCP17.chapter9.genericc;

public class SizeLimitedCrate<T,U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }


}
record Rabbit(int id, String name) {}
class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(1,"A");
        Integer numberPounds = 15_000;

        SizeLimitedCrate<Rabbit, Integer> c1 = new SizeLimitedCrate<>(rabbit, numberPounds);



    }
}
