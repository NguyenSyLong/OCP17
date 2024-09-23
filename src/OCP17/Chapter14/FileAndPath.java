package OCP17.Chapter14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileAndPath {
    public static void main(String[] args) throws IOException {
//        io();
//        nio();

//        Path path = Paths.get("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14/abc.txt");
//        boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);

//        System.out.println(exists);
//        Double longa = Double.valueOf("12.0f");
//        System.out.println(isNumericWithRegex("12,"));
        List<Integer> numbers = new ArrayList<>();

        // Chỉ duyệt qua phần tử khi giá trị nhỏ hơn 5
        numbers = numbers.stream()
                .takeWhile(n -> n < 5).collect(Collectors.toList());
        System.out.println(numbers);
    }
    public static boolean isNumericWithRegex(String str) {
        return str.matches("[-+]?\\d+(\\.\\d+)?");
    }



//    public static void io() {
//        var file = new File("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14");
//
//        if(file.exists()) {
//            System.out.println("Absolute Path: " + file.getAbsolutePath());
//            System.out.println("Is Directory: " + file.isDirectory());
//            System.out.println("Parent Path: " + file.getParent());
//            if (file.isFile()) {
//                System.out.println("Size: " + file.length());
//                System.out.println("Last Modified: " + file.lastModified());
//            } else {
//                for (File listFile : file.listFiles()) {
//                    System.out.println("   " + listFile.getName());
//                }
//            }
//        }
//    }

//    public static void nio() throws IOException {
//        var path = Path.of("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14");
//        if(Files.exists(path)) {
//            System.out.println("Absolute Path: " + path.toAbsolutePath());
//            System.out.println("Is Directory: " + Files.isDirectory(path));
//            System.out.println("Parent Path: " + path.getParent());
//            if (Files.isRegularFile(path)) {
//                System.out.println("Size: " + Files.size(path));
//                System.out.println("Last Modified: " + Files.getLastModifiedTime(path));
//            } else {
//                try (Stream<Path> stream = Files.list(path)){
//                    stream.forEach(p -> System.out.println("   " + p.getFileName()));
//                }
//            }
//
//        }
//    }

}
