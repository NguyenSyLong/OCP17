package OCP17.chapter10;

import java.util.Optional;

public class Stream2 {
    public static void main(String[] args) {

//        Stream<Integer> stream = Stream.of(1, 2, 3);
//        System.out.println(stream.reduce(0,(s,n)->s+n));
//        System.out.println(stream.mapToInt(x->x).sum());
//        IntStream a = IntStream.of(1,2,3);
//        System.out.println(a.average().getAsDouble());
//        DoubleStream doubleStream = DoubleStream.of(1.0,2.0,3.0);
//        OptionalDouble average = doubleStream.average();
//        average.ifPresent(System.out::println);

//        IntStream a = stream.mapToInt(Integer::intValue);

//        Stream<Integer> stream = a.boxed();

//        var random = DoubleStream.generate(Math::random);
//        var fractions = DoubleStream.iterate(.5, d->d/2);
//        random.limit(3).forEach(System.out::println);
//        fractions.limit(3).forEach(System.out::println);
//        IntStream range = IntStream.range(1,6);
//        IntStream range1 = IntStream.rangeClosed(1,6);
//        System.out.println(range1.summaryStatistics().getCount());
//
//        Stream<String> abc = Stream.of("penguin", "fish");
//        Stream<Integer> intStream = abc.mapToInt(s -> s.length()).boxed();
//        var integerList = new ArrayList<Integer>();
//        IntStream ints = integerList.stream()
//                .flatMapToInt(x -> IntStream.of(x));
//        threeDigit(Optional.of(33));
//
//        Optional<Integer> optional = Optional.of(4);
//        Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
//        System.out.println(result.get());


    }



    private static void threeDigit(Optional<Integer> optional) {
//        optional.map(n->""+n).filter(s -> s.length()==3).ifPresent(System.out::println);

    }


}
