package OCP17.chapter9;

import java.util.*;

public class UseTreeSet {
    static class Rabbit { int id; }
    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("A"));

//        Set<Rabbit> rabbits =  new TreeSet<>();
//        rabbits.add(new Rabbit());

        Set<Rabbit> rabbits1 = new TreeSet<>((r1, r2)-> r1.id-r2.id);

        rabbits1.add(new Rabbit());
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        Collections.sort(bunnies,Collections.reverseOrder());
        System.out.println(bunnies);
    }
}
