package OCP17.chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapA {
    public static void main(String[] args) {
//        var map = Map.of("1","abc", "2", "ddd");
//        var map1 = Map.ofEntries(Map.entry(1,3), Map.entry(2,4));
        //Put
//        Map<String, String> map = new HashMap<>();
//        map.put("koala","bamboo");
//        map.put("lion","ac");
//        map.put("11","bamboo");
//        map.keySet().forEach(System.out::println);

//        Map<String,String> map1 = new TreeMap<>();
//        map1.put("koala","bamboo");
//        map1.put("lion","ac");
//        map1.keySet().forEach(System.out::println);


        // contains, containsKey, containsValue

//        System.out.println(map.containsKey("koala"));
//        System.out.println(map.containsValue("bamboo"));
//
//        System.out.println(map.size());
//        System.out.println(map.isEmpty());

        // lặp qua 1 map
//        map.forEach((k,v)-> System.out.println(k+" "+v));
//        map.values().forEach(System.out::println);
//
//        map.entrySet().forEach(System.out::println);

        //Lấy một giá trị một cách an toàn
//        Map<Character,String> map = new HashMap<>();
//        map.put('x',"Ac");
//        System.out.println(map.get('x'));
//        System.out.println(map.getOrDefault('y', "assss"));

        //Thay thế giá trị
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 2);
//        map.put(2, 4);
//        map.put(2, 3);
//        Integer original = map.replace(2,10);
//        System.out.println(original);
//        System.out.println(map);
//        map.replaceAll((a,b)-> a.intValue()+b.intValue());
//        System.out.println(map);

        //put nếu value không có giá trị
//        Map<String, String> favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", null);
//        favorites.put("Jenny", null);
//        favorites.putIfAbsent("Jenny", "Tram");
//        favorites.putIfAbsent("Tom", "Tram");
//        System.out.println(favorites);

        //Hợp nhất dữ liệu
//        BiFunction<String,String,String>mapper = (v1, v2) -> v1.length()>v2.length() ?v1:v2;
//        Map<String, String>favorites = new HashMap<>();
//        favorites.put("Jenny", "Bus Tour");
//        favorites.put("Tom", "Tram");
//
//        String jenny = favorites.merge("Jenny","Skyride",mapper);
//        String tom = favorites.merge("Tom","Skyride",mapper);
//        System.out.println(favorites);

        BiFunction<String, String, String> mapper = (v1, v2) -> null;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");

        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);

        System.out.println(favorites);

    }
}
