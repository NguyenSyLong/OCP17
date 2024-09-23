package OCP17.Chapter14.serializable;



public class BabyChimpanzee extends Chimpanzee {
    private static final long serialVersionUID = 3L;
    private String mother;

    public BabyChimpanzee() {
        super();
    }

    public BabyChimpanzee(String mother, String name, char type) {

        super(name, 10, type);
        this.mother = mother;
    }

    @Override
    public String toString() {
        return super.toString() + ", [mother=" + mother + "]";
    }
}
