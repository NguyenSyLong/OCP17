package OCP17.chapter9;

import java.util.ArrayList;
import java.util.List;

public class ListA {

    public static void main(String[] args) {
//        var link1 = new LinkedList<String>();
//        var link2 = new LinkedList<>(link1);
//        var link3 = new LinkedList<String>();
//        link2.add("A");
//        for (String s : link1) {
//            System.out.println(s);
//        }
//
//        link2.add(0,"NY");
//        link2.set(1,"FL");
//        System.out.println(link2.remove("NY"));
//        link2.remove(0);

//        var numbers= Arrays.asList(1,2,3);
//        numbers.replaceAll(x->x*2);
//        System.out.println(numbers);

//        var list = new LinkedList<Integer>();
//        list.add(3);
//        list.add(2);
//        list.add(1);
//
//        list.remove(2);
//        list.remove(Integer.valueOf(2));
//        System.out.println(Integer.valueOf(2));
//        System.out.println(list);

        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(list.toArray(new String[0]));
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);





    }
}
