package OCP172nd.Chapter20.IOStream;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) {

        char[] buf = new char[5];
        try(
                FileReader fr = new FileReader("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\long.txt");

                FileWriter fw = new FileWriter("C:\\Users\\Admin\\Documents\\vmo\\source\\OCP17\\abc\\abc.txt"))
        {
            while( fr.read(buf) != -1){
                fw.write(buf);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
