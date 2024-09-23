package OCP17.Chapter14.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Chimpanzee implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    { this.age = 14; }

    public Chimpanzee() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Chimpanzee(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", type=" + type + "]";
    }

    public static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimpanzee : chimpanzees)
                out.writeObject(chimpanzee);
        }
    }

    public static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee chimp)
                    chimpanzees.add(chimp);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return chimpanzees;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        chimpanzees.add(new BabyChimpanzee("A","BabyHam", 'X'));
        chimpanzees.add(new BabyChimpanzee("B", "BabyEnos", 'Y'));
        File dataFile = new File("./abc/long.txt");

        saveToFile(chimpanzees, dataFile);
        var chimpanzeesFromDisk = readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }

}
