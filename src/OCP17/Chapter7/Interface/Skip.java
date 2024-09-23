package OCP17.Chapter7.Interface;

public class Skip implements Hop {
    public int skip() {
        checkTime(10);
        return Hop.getJumpHeight();
    }

    private static void checkTime(int hour) {
        if (hour> 17) {
            System.out.println("You're late!");
        } else {
            System.out.println("You have "+(17-hour)+" hours left "
                    + "to make the appointment");
        } }
}
