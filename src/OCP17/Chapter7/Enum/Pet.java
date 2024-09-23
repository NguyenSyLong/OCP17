package OCP17.Chapter7.Enum;

public enum Pet {
    DOG("D"), CAT("C"), FISH("F");
    private static final String c = "a";
    private String name;
    Pet(String s) { this.name = s +c; }
    public String getData() { return name; }
}
