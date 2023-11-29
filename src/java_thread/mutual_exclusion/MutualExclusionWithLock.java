package java_thread.mutual_exclusion;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class MutualExclusionWithLock {
    private static int COUNTER = 0;
    private static Lock LOCK = new ReentrantLock();

    public static void main(String... args) throws Exception {

        final Runnable increaseCounterFunc = () -> IntStream
                .range(0, 100)
                .forEach(MutualExclusionWithLock::increaseCounter);

        Thread first = new Thread(increaseCounterFunc);
        Thread second = new Thread(increaseCounterFunc);

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(COUNTER);
    }

    private static void increaseCounter(int i) {
        LOCK.lock();
        LOCK.lock();
        ++COUNTER;
        LOCK.unlock();
        LOCK.unlock();
    }
}
