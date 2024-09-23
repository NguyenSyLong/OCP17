package OCP17.chapter9;

import java.util.*;

public class SetA {
    public static void main(String[] args) {
//        Set<Character> letters = Set.of('z', '0');
//        Set<Character> copy = Set.copyOf(letters);
//        System.out.println(copy);


//        Set<Integer> set = new HashSet<>();
//        boolean b1 = set.add(66);
//        boolean b2 = set.add(10);
//        boolean b3 = set.add(66);
//        boolean b4 = set.add(8);
//
//        set.forEach(System.out::println);

//        Queue<String> queue =  new LinkedList<>();
//        queue.add("10");
//        queue.add("A");
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());


        Deque<String> deque = new LinkedList<>();
        deque.addFirst("1");
        deque.addLast("0");
        System.out.println(deque.getFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.peekFirst());

        Deque<String> stask = new LinkedList<>();
        stask.push("A");
        stask.push("C");
        System.out.println(stask.pop());


    }
}
