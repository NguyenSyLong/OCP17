package OCP17.chapter9.genericc;

import OCP17.chapter9.Duck;
import OCP17.chapter9.Squirel;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Crate<T> {

    private T contents;
    public T lookInCreate() {
        return contents;
    }
    public void packCrate(T contents) {
        this.contents = contents;
    }



}
class main {
//    public static void main(String[] args) {
//        Duck duck = new Duck("A",2);
//        Crate<Duck> crate = new Crate<>();
//        crate.packCrate(duck);
//        System.out.println(crate.lookInCreate());
//        Character a = 2;
////        Squirel squirel = new Squirel(2, "B");
////        Crate<Squirel> squirelCrate = new Crate<>();
//    }
}

 class LongTailAnimal {
    protected void chew(List<Integer> input) {}
    protected void chew(ArrayList<Double> input) {}  // DOES NOT COMPILE
}

// class Reptile {
//    protected void sleep(List<Integer> hours) {}
//}
// class Gecko extends Reptile {
//    protected void sleep(Set<Double> hours) {}  // DOES NOT COMPILE
//}




class Person {
    private static int count = 0;
    private String id = "0"; private String interest;
    public Person(String interest){ this.interest = interest; this.id = "" + ++count; }
    public String getInterest(){ return interest;     }
    public void setInterest(String interest){ this.interest = interest; }
    public String toString(){ return id; }
}

 class StudyGroup
{
    String name = "MATH";
    TreeSet<Person> set = new TreeSet<Person>();
    public void add(Person p) {
        if(name.equals(p.getInterest())) set.add(p);
    }

    public static void main(String[] args) {
        StudyGroup mathGroup = new StudyGroup();
        mathGroup.add(new Person("MATH"));
        System.out.println("A");
        mathGroup.add(new Person("MATH"));
        System.out.println("B");
        System.out.println(mathGroup.set);
    }
}

