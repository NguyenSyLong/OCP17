package OCP17.Chapter14;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAndDirectory {
    public static void main(String[] args) {
//        File zooFile1 = new File("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14/abc.txt");
//        File zooFile2 = new File("null","src/OCP17.Chapter14/abc.txt");
//        File parent = new File("C:/Users/Admin/Documents/vmo/source/OCP17");
//        File zooFile3 = new File(parent, "src/OCP17.Chapter14/abc.txt");
//        System.out.println(zooFile3.exists());

//        Path zooPath1 = Path.of("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14/abc.txt");
//        Path zooPath2 = Path.of("C:/Users/Admin/Documents/vmo/source/OCP17","src","OCP17.Chapter14","abc.txt");
//
//        Path zooPath3 = Paths.get("C:/Users/Admin/Documents/vmo/source/OCP17/src/OCP17.Chapter14/abc.txt");
//
//
//
//        zooFile1.toPath();
//        zooPath1.toFile();

        Path zooPath1 = FileSystems.getDefault().getPath("/abc.txt");
        System.out.println(Files.exists(zooPath1));

    }


}
