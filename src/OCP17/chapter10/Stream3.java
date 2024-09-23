package OCP17.chapter10;

public class Stream3 {
    public static void main(String[] args) {

//        Stream<Integer> a= Stream.of(1,2,3);
//        Double b = a.collect(Collectors.averagingInt(x-> x));
//        var ohMy = Stream.of("tions", "tigers", "tears");
//        List<String> result = ohMy
//                .filter(s -> s.startsWith("t"))
//                .collect(Collectors.toList());
//        System.out.println(result);

//        var ohMy = Stream.of("lions","aaaaa", "tig", "bears");
//        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s->s, String ::length));
//        System.out.println(map);
//
//        Map<Integer, String> map  = ohMy.collect(Collectors.toMap(String::length, k->k, (s1,s2)-> s1+","+s2));
//        System.out.println(map);

//        TreeMap<Integer, String> map2 = ohMy.collect(Collectors.toMap(String::length,k->k,(s1,s2)->s1+s2, TreeMap::new));
//
//        System.out.println(map2);
//        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
//        System.out.println(map);

//        TreeMap<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
//
//        System.out.println(map);

//        var ohMy = Stream.of("lions", "tigers", "bears", "elephants", "cats", "dogs");
//        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length,Collectors.counting()));
//        System.out.println(map);
//        Map<Character, List<String>> map = ohMy.collect(
//                Collectors.groupingBy(s -> s.charAt(0)));

//
//        Map<Integer, Set<Set<String>>> map = ohMy.collect(
//                Collectors.groupingBy(
//                        String::length,
//                        Collectors.mapping(
//                                s -> Collections.singleton(s),
//                                Collectors.toSet())));
//        System.out.println(map);
//        var ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, List<String>> map = ohMy.collect(
//                Collectors.groupingBy(String::length));
//        System.out.println(map);


//        Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s->s.length()<5));
//        System.out.println(map);

//        Map<Boolean, Set<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length()<7, Collectors.toSet()));
//        System.out.println(map);
//        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        System.out.println(map);

//        Map<Integer, Optional<Character>> map = ohMy.collect(Collectors.groupingBy(String::length,
//                Collectors.mapping(s->s.charAt(0),
//                Collectors.minBy((a,b)->a-b))));
//        System.out.println(map);
//
//        var map = ohMy.collect(
//                Collectors.groupingBy(String ::length,
//                Collectors.mapping(s -> s.charAt(0),
//                Collectors.minBy((a, b) -> b-a)) ));
//        System.out.println(map);

    }


}
