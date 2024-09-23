package OCP172nd.Chapter20.IOStream.DataStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (FileOutputStream outputFile = new FileOutputStream("primitives.data");
             DataOutputStream outputStream = new DataOutputStream(outputFile)) {

            outputStream.writeBoolean(false);
            outputStream.writeBoolean(true);

            outputStream.writeChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            outputStream.writeByte(Byte.MAX_VALUE);
            outputStream.writeShort(Short.MIN_VALUE);
            outputStream.writeInt(Integer.MAX_VALUE);
            outputStream.writeLong(Long.MIN_VALUE);
            outputStream.writeFloat(Float.MAX_VALUE);
            outputStream.writeDouble(Math.PI);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream inputFile = new FileInputStream("primitives.data");
            DataInputStream inputStream = new DataInputStream(inputFile)) {

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readLine());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

            // Check for end of stream:
            int value = inputStream.readByte();
            System.out.println("More input: " + value);
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found.");
        } catch (EOFException eof) {
            System.out.println("End of input stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
