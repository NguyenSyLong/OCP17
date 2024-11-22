package OCP17.chapter13;

import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();


        System.out.println(Stream.of(1,2,3,4,5,2,31,1,213,31,23,12,31,23,123,1,23,12,31,23,123,1,23,12,3,1,23,123,12,31,23,12,31,23,12,3,123,12,312,3,123,12).parallel()
                .findFirst().get());
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: "+timeTaken+" seconds");
    }
    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return input;
    }
}
