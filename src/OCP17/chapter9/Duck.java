package OCP17.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Duck implements Comparable<Duck>{
    private String name;
    private int weight;
    public Duck(String name) {
        this.name = name;
    }

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }


    public static void main(String[] args) {
//        Comparator<Duck> byWeight = new Comparator<>() {
//            @Override
//            public int compare(Duck o1, Duck o2) {
//                return o1.getWeight() - o2.getWeight();
//            }
//        };
        Comparator<Duck> byWeight = Comparator.comparing(Duck::getWeight);
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quacks",1));
        ducks.add(new Duck("Long",2));
        Collections.sort(ducks);
        System.out.println(ducks);
        Collections.sort(ducks,byWeight);
        System.out.println(ducks);
    }
}
