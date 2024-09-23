package OCP17.chapter10;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {
//        Stream.iterate(new Integer[]{0,1},a->new Integer[]{a[1],a[0]+a[1]}).limit(10)
//                .map(t->t[0]).forEach(System.out::println);
//        Predicate<Integer> predicate = num -> {
//            if(num<=1) return false;
//            for (int i=2; i<=Math.sqrt(num); i++) {
//                if(num%i==0) {
//                    return false;
//                }
//            }
//            return true;
//        };
//        Stream.iterate(2, n -> n < 50, n -> n + 1)
//                .filter(predicate)
//                .forEach(System.out::println);

//        System.out.println( Stream.iterate(1, n -> n +1).limit(20).count());

//        Optional<Double> a = Stream.generate(Math::random).limit(5).peek(System.out ::println).min(Double::compare);
//        Optional<Double> b= Stream.generate(Math::random).limit(5).peek(System.out ::println).max((x,y)->Double.compare(x,y));
//        Optional<String> c = Stream.of("A", "B", "C", "D").findFirst();
//        boolean a = Stream.generate(Math::random).limit(5).peek(System.out ::println).allMatch(x->x>0);
//        boolean b = Stream.of(1,2,3,4,100).limit(5).peek(System.out ::println).allMatch(x->x<100);
//        Integer a = Stream.of(1,2,3,4,100).reduce(0,Integer::sum);

//        Set<Integer> a = Stream.of(1,2,3,4,100).collect(Collectors.toSet());
//        System.out.println(a);
//        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//        Stream<Object> d = s.map(c-> new aa(c,c));
//        d.forEach(System.out::println);

//        Stream<List<String>> a = Stream.of(List.of("A","V","C"),List.of("A","V","C"));
//        a.flatMap(d -> d.stream()).forEach(System.out::println);

//        Stream<Integer> stream =Stream.of(1,2,3);
//        System.out.println(stream.mapToInt(x->x).sum());
//        IntStream intStream = IntStream.of(1,2,3);
//        OptionalDouble a = intStream.average();
//        System.out.println(a.getAsDouble());
//        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
//        count.forEach(System.out::println);

//        Stream<String> objStream = Stream.of("penguin", "fish");
//        IntStream intStream = objStream.mapToInt(s->s.length());
//        intStream.forEach(System.out::println);

//        var integerList = List.of(List.of(1,2,3,4),List.of(5,6,7,8));
//        IntStream ints = integerList.stream().flatMapToInt(x-> x.stream().mapToInt(d->d));
//        Stream<Integer> intsss = ints.boxed();

//        List<StringBuilder> messages =
//                Arrays.asList(new StringBuilder(), new StringBuilder()); messages.stream()
//                .forEach(s->s.append("helloworld"));
//                messages.forEach(s->{
//                    s.insert(5,",");
//                    System.out.println(s); });
//        Stream<Integer> abc = Stream.of(1,2,3,4,5);
//        abc.parallel().peek(System.out::println).forEachOrdered(System.out::println);



        List<String> letters = Arrays.asList("j", "a", "v","a");
        String word = letters.stream().collect(Collectors.groupingBy(a->a)).toString();
        System.out.println(word);

    }
    record aa(String a, String b) {}
}
