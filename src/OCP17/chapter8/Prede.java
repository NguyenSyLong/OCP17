package OCP17.chapter8;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Prede {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> p1 = String :: isEmpty;
        Predicate<String> p2 = (x) -> x.isEmpty();

        BiPredicate<String, String> b1 = String :: startsWith;
        BiPredicate<String, String> b2 = (x,y) -> x.startsWith(y);


        System.out.println(p1.test("A"));
        System.out.println(p2.test("B"));

        System.out.println(b1.test("ABC", "A"));
        System.out.println(b2.test("CD","ZH"));

        //Function
        Function<String, Integer> f1 = String :: length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(p1.test("A"));
        System.out.println(p2.test("B"));





    }
}
