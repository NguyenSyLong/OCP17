package OCP17.chapter10;

import java.io.IOException;
import java.util.List;

public class ExceptionCaseStudy {
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public void good() throws IOException {
        ExceptionCaseStudy.create().stream().count();
    }

    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } }

//    public static void main(String[] args) {
//        createSafe();
//    }


}
