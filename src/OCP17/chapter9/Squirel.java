package OCP17.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Squirel {
    private int weight;
    private String species;

    public Squirel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Squirel{" +
                "weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }
}

class MultipleFieldComparator implements Comparator<Squirel> {

    @Override
    public int compare(Squirel o1, Squirel o2) {
        int result = o1.getSpecies().compareTo(o2.getSpecies());
        if(result !=0) return result;
        return o1.getWeight() - o2.getWeight();
    }
}

class main {
    public static void main(String[] args) {
        List<Squirel> a = new ArrayList<>();
        a.add(new Squirel(2,"b"));

        a.add(new Squirel(3,"a"));
//
//        MultipleFieldComparator d= new MultipleFieldComparator();

//
//        System.out.println(a);

        Comparator<Squirel> d= Comparator.comparing(Squirel::getSpecies).thenComparing(Squirel::getWeight);
        Collections.sort(a, d );
        System.out.println(a);
    }
}
