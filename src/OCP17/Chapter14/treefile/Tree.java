package OCP17.Chapter14.treefile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tree {
    public static void main(String[] args) throws IOException {
//        var size = getPathSize(Path.of("C:/Users/Admin/Documents/vmo/source/OCP17/abc/long.txt"));
//        System.out.format("Total Size: %f megabytes", (size/1000000.0));

        Path path = Paths.get("C:/Users/Admin/Documents/vmo/source/OCP17/abc");
        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                        && p.toString().endsWith(".txt")
                        && a.size() < minSize)) {
            s.forEach(System.out::println);
        }

        Stream<String> ref = new BufferedReader(new FileReader("C:/Users/Admin/Documents/vmo/source/OCP17/abc")).lines();
    }

    private static long getSize(Path p) {
        try {
            return  Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source,1)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(Tree::getSize)
                    .sum();
        }
    }



}
