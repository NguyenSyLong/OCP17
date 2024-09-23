package OCP17.Chapter14;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2 {
    public static void main(String[] args) throws IOException {
//        Path p = Path.of("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14/abc.txt");
//        System.out.println(p);
//
//        for (int i = 0; i< p.getNameCount();i++) {
//            System.out.println("   Element " + i + " is: " + p.getName(i));
//        }

//        var path = Path.of("/");
//        System.out.println(path.getNameCount());
//        System.out.println(path.getName(0));

//        var p = Paths.get("mammal/omnivore/raccoon.image");
//        System.out.println("Path is: " + p);
//        for (int i = 0; i < p.getNameCount(); i++) {
//            System.out.println("   Element " + i + " is: " + p.getName(i));
//        }
//
//        System.out.println(p.subpath(0,3));
//        System.out.println(p.subpath(1,2));
//        System.out.println(p.subpath(2,3));
//        printPathInformation(Path.of("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14/abc.txt"));
//        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
//        printPathInformation(Path.of("./armadillo/../shells.txt"));

//        Path path1 = Path.of("/cat/../panther");
//        Path path2 = Path.of("food");
//
//        System.out.println(path1.resolve(path2));
//        Path path3 = Path.of("/abc/a");
//        System.out.println(path1.resolve(path3));

//        var p1 = Paths.get("/pony/../weather.txt");
//        var p2 = Paths.get("/weather.txt");
//        System.out.println(p1.normalize());
//        System.out.println(p1.equals(p2));
//        System.out.println(p1.normalize().equals(p2.normalize()));
        System.out.println(Paths.get("../filetest/abc.txt").toRealPath());

    }

    public static void printPathInformation(Path path) {
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());

        Path curr = path;
        while ((curr = curr.getParent()) != null) {
            System.out.println(curr);
        }

        System.out.println();
    }
}
