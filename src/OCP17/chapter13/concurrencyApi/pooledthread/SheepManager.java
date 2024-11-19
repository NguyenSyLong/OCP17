package OCP17.chapter13.concurrencyApi.pooledthread;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private static int sheepCount = 0;
    private final Object herd = new Object();
//    private AtomicInteger sheepCount = new AtomicInteger(0);
//     private void incrementAndReport() {
//       System.out.print((sheepCount.incrementAndGet())+" ");
//     }
    private synchronized static void incrementAndReport() {
            System.out.print((++sheepCount)+" ");
    }
    public static void main(String[] args) {
//        ExecutorService service = Executors.newFixedThreadPool(20);
//                try {
//
//                      for(int i = 0; i < 10; i++) {
//                          SheepManager manager = new SheepManager();
//                          service.submit(() -> manager.incrementAndReport());
//                      }
//
//                   } finally {
//                    service.shutdown();
//                }

    }
}
