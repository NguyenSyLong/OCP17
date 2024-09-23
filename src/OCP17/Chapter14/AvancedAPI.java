package OCP17.Chapter14;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class AvancedAPI {
    public static void main(String[] args) throws IOException {
//        InputStream is = new FileInputStream("./abc/long.txt");
//        readData(is);
//        System.out.println(Files.isDirectory(Paths.get("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\long.txt")));
//        System.out.println(Files.isSymbolicLink(Paths.get("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\long.txt")));
//        System.out.println(Files.isRegularFile(Paths.get("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\long.txt")));
//        System.out.print(Files.isExecutable(Paths.get("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\long.txt")));

        var path = Paths.get("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\long.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
//        System.out.println("Is a directory? " + data.isDirectory());
//        System.out.println("Is a regular file? " + data.isRegularFile());
//        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
//        System.out.println("Size (in bytes): " + data.size());
//        System.out.println("Last modified: " + data.lastModifiedTime());
        System.out.println("Last modified: " + data.lastModifiedTime());
        BasicFileAttributeView view = Files.getFileAttributeView(path,
                BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();
        FileTime lastMod = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
        view.setTimes(lastMod, null, null);
        System.out.println(view);

        System.out.println("Last modified: " + data.lastModifiedTime());
    }

    private static void readData(InputStream is) throws IOException {
        System.out.print((char) is.read());
//        if(true) {
//            is.mark(100);
//            System.out.println((char) is.read());
//            System.out.println((char) is.read());
//            is.reset();
//        }
//        System.out.print((char) is.read());
//        System.out.print((char) is.read());
//        System.out.print((char) is.read());
        is.skip(2);
        is.read();
        System.out.print((char) is.read());
        System.out.println((char) is.read());

    }
}
