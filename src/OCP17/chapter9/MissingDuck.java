package OCP17.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingDuck implements Comparable<MissingDuck>{
    private String name;

    public MissingDuck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MissingDuck{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(MissingDuck o) {
        if (o == null) {
            throw new IllegalArgumentException("poor formed duck");
        }
        if(this.name == null && o.name == null) {
            return 0;
        }
        else if(this.name == null) return 1;
        else if(o.name == null) return -1;
        else  return name.compareTo(o.name);
    }


    public static void main(String[] args) {
        List<MissingDuck> a = new ArrayList<>();
        a.add(new MissingDuck(null));
        a.add(new MissingDuck("b"));
        Collections.sort(a);
        a.stream().forEach(System.out::println);
    }
}
