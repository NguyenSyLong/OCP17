package OCP17.Chapter7.Enum;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        TreeSet<Day> days = new TreeSet<>();
        days.add(Day.WEDNESDAY);
        days.add(Day.SUNDAY);
        days.add(Day.SATURDAY);
        days.stream().forEach(day -> {
            System.out.println(day);
        });


    }
}
