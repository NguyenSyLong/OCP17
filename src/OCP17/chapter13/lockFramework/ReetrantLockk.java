package OCP17.chapter13.lockFramework;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReetrantLockk {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        if(lock.tryLock(10, TimeUnit.SECONDS)) {
            try {
                lock.lock();

            } finally {
                lock.unlock();
            }
        } else {
        }

        new Thread(() -> printHello(lock)).start();
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }
}
