package OCP17.chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(6,9,2,8);
        Collections.sort(a);
        System.out.println(Collections.binarySearch(a,6));
        System.out.println(Collections.binarySearch(a, 3));
    }
}
