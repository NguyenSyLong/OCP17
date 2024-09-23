package OCP17.chapter10;

import java.util.ArrayList;

public class StreamApi {
    public static void main(String[] args) {


//        Stream<String> s = Stream.of("monkey", "monkey", "bonobo");
//        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
//        min.ifPresent(System.out::println);
//
//        Optional<?> minEmpty = Stream.empty().min((s1,s2)->0);
//        System.out.println(minEmpty.isPresent());

//        Stream<String> s1 = Stream.of("aaa","bbbbbbbbb","vvvv");
//        Stream<Double> infinite = Stream.generate(Math::random);
//        s1.findAny().ifPresent(System.out::println);
//        infinite.findAny().ifPresent(System.out::println);
//
//        var a1 = List.of("aa","1a","c");
//        Stream<String> in1 = Stream.generate(()->"chimp");
//        Predicate<String> pred = x -> Character.isDigit(x.charAt(0));
//        System.out.println(a1.stream().allMatch(pred));
//        System.out.println(a1.stream().anyMatch(pred));
//        System.out.println(a1.stream().noneMatch(pred));
//        System.out.println(in1.anyMatch(pred));

//
//        Stream<String> s = Stream.of("Monkey","Gorilla","Bonobo");
//        s.forEach(System.out::println);
//
//        Stream<Integer> s1 = Stream.of(1);
//        s1.forEach(System.out::println);

//        var array = new String[]{"W","O","L","F"};
//        var result = "";
//        for (var a: array) result = result +a;
//        Stream<String> a = Arrays.stream(array);
//        result = a.reduce("",(s,c)->s+c);
//        result = a.reduce("",String::concat);
//        System.out.println(result);
//        Stream<Integer> integer = Stream.of(1,2,3,4,5);
//        System.out.println(integer.reduce((a,b)->a*b).get());
//
//        BinaryOperator<Integer> op = (a,b)->a*b;
//        Stream<Integer> empty = Stream.empty();
//        Stream<Integer> oneELement = Stream.of(3);
//        Stream<Integer> ale = Stream.of(12,2);
//        empty.reduce(op).ifPresent(System.out::println);
//        oneELement.reduce(op).ifPresent(System.out::println);

//        Stream<String> stream = Stream.of("w", "o", "l", "f!");
//        int length = stream.reduce(0,(i,s)->i+s.length(),(a,b)->a+b);
//        System.out.println(length);

//        List<String> animals = List.of("cat", "dog", "elephant", "tiger", "bear");
//
//        Stream<String> stream = animals.stream()
//                .peek(s -> System.out.println("Original: " + s)) // In ra các phần tử ban đầu
//                .filter(s -> s.length() > 3)
//                .peek(s -> System.out.println("Filtered: " + s)) // In ra các phần tử sau khi lọc
//                .map(String::toUpperCase)
//                .peek(s -> System.out.println("Uppercase: " + s)); // In ra các phần tử sau khi chuyển thành chữ hoa
//
//        stream.forEach(s -> System.out.println("Final: " + s));


        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');

//        Stream<List<?>> stream = Stream.of(numbers,letters);
//        stream.map(List::size).forEach(System.out::println);
//        Stream<List<?>> bad = Stream.of(numbers,letters);
//        bad.peek(x->x.remove(0)).map(List::size).forEach(System.out::println);

//        AtomicInteger counter = new AtomicInteger();
//        Stream.of("1","2","3","4").peek(e->counter.incrementAndGet()).forEach(System.out::println);
//        System.out.println(counter.get());

//        Stream.of("apple","banana", "cherry", null).peek(e->{
//            if(e==null||e.isEmpty()) {
//                System.out.println("iNVALID" +e);
//            }
//        }).filter(e->e!=null&&!e.isEmpty()).forEach(System.out::println);
//
//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        list.stream().filter(name->name.length() == 4).sorted().limit(2).forEach(System.out::println);
//        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
//        Spliterator<String> originalBagOfFood = stream.spliterator();
//
//    // Chia nhỏ Spliterator ban đầu thành hai phần
//        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
//        emmasBag.forEachRemaining(System.out::print);  // bird-bunny-cat-
//
//    // Chia nhỏ Spliterator ban đầu một lần nữa
//        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
//        jillsBag.tryAdvance(System.out::print);        // dog-
//        jillsBag.forEachRemaining(System.out::print);  // fish-
//
//    // Duyệt qua các phần tử còn lại trong Spliterator ban đầu
//        originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse-


    }
}
