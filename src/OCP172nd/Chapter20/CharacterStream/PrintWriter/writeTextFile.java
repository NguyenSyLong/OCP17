package OCP172nd.Chapter20.CharacterStream.PrintWriter;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDate;

public class writeTextFile {
    public static void main(String[] args) {
//        try( FileInputStream inputFile = new FileInputStream("info.txt");) {
//            FileOutputStream outputFile = new FileOutputStream("info.txt");
//            OutputStreamWriter outputStream = new OutputStreamWriter(outputFile);
//            PrintWriter printWriter1 = new PrintWriter(outputStream, true);
//            printWriter1.println('a');
//            Charset utf8 = Charset.forName("UTF-8");
//            FileWriter fileWriter = new FileWriter("info.txt", utf8);
//            PrintWriter printWriter5 = new PrintWriter(fileWriter, true);

//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("info.txt"));
//            PrintWriter printWriter = new PrintWriter(bufferedWriter);
//            printWriter.println("Baaaaaaaaaaaaaaaa");
//            Charset utf8 = Charset.forName("UTF-8");
//            String fileName = "info.txt";
//            readFile(fileName, utf8);
//            Charset utf8 = Charset.forName("UTF-8");
//            FileOutputStream   outputFile      = new FileOutputStream("info.txt");
//            OutputStreamWriter outputStream    = new OutputStreamWriter(outputFile, utf8);
//            BufferedWriter     bufferedWriter1 = new BufferedWriter(outputStream);
//            PrintWriter        printWriter   = new PrintWriter(bufferedWriter1, true);
//            printWriter.println("Hello, world!");
//            printWriter.println("This is a test.");
//            printWriter.close();

//            FileWriter fileWriter = new FileWriter("info.txt");
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            PrintWriter printWriter = new PrintWriter(bufferedWriter, true);
//            printWriter.println("Hello, world!");
//            printWriter.println("This is a test.");
//            printWriter.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Charset utf8 = Charset.forName("UTF-8");                           // (1)

        try(// Create a BufferedWriter that uses UTF-8 character encoding     (2)
            FileWriter writer = new FileWriter("info.txt", utf8);
            BufferedWriter bufferedWriter1 = new BufferedWriter(writer);
            PrintWriter printWriter = new PrintWriter(bufferedWriter1, true);) {

            System.out.println("Writing using encoding: " + writer.getEncoding());
            // Print some values, one on each line.                             (3)
            printWriter.println(LocalDate.now());
            printWriter.println(Integer.MAX_VALUE);
            printWriter.println(Long.MIN_VALUE);
            printWriter.println(Math.PI);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(// Create a BufferedReader that uses UTF-8 character encoding     (4)
            FileReader reader = new FileReader("info.txt", utf8);
            BufferedReader bufferedReader = new BufferedReader(reader);) {

            System.out.println("Reading using encoding: " + reader.getEncoding());
            // Read the character input and parse accordingly.                  (5)
            LocalDate ld = LocalDate.parse(bufferedReader.readLine());
            int iMax = Integer.parseInt(bufferedReader.readLine());
            long lMin = Long.parseLong(bufferedReader.readLine());
            double pi = Double.parseDouble(bufferedReader.readLine());

            // Write the values read on the terminal                            (6)
            System.out.println("Values read:");
            System.out.println(ld);
            System.out.println(iMax);
            System.out.println(lMin);
            System.out.println(pi);

            // Check for end of stream:                                         (7)
            String line = bufferedReader.readLine();
            if (line != null ) {
                System.out.println("More input: " + line);
            } else {
                System.out.println("End of input stream");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFile(String fileName, Charset charset) {
        try (FileInputStream inputFile = new FileInputStream(fileName);
             InputStreamReader inputStreamReader = new InputStreamReader(inputFile, charset);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
