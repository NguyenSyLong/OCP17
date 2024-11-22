package OCP17.chapter13.concurrentCollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentCol {
    public static void main(String[] args) {
//        var foodData = new HashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//        for(String key: foodData.keySet())
//            foodData.remove(key);

        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " ");  // In ra: 4 3 42
            favNumbers.add(n + 1);      // Thêm phần tử mới
        }
        favNumbers.forEach(System.out::println);
        System.out.println("Size: " + favNumbers.size());
    }
}
