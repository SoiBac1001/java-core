package java_thread.race_condition;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RaceCondition {
    public static void main(String... args) throws InterruptedException {
        List<Shopper> shoppers = IntStream.range(0, 6)
                .mapToObj(Shopper::new)
                .collect(Collectors.toList());
        // Chạy toàn bộ các thread
        shoppers.forEach(Thread::start);
        // Chờ tất cả thread hoàn thành
        for (Shopper shopper : shoppers) {
            shopper.join();
        }
        System.out.println("Total packs: " + Shopper.MASK_PACK_COUNT);
    }
}

class Shopper extends Thread {

    static int MASK_PACK_COUNT = 1;
    static CyclicBarrier BARRIER = new CyclicBarrier(6);

    Shopper(int i) {
        setName(i % 2 == 0 ? "Husband" : "Wife");
    }

    @Override
    public void run() {
        addMask(getName());
    }

    static void addMask(String threadName) {
        if ("husband".equalsIgnoreCase(threadName)) {
            synchronized (Shopper.class) {
                MASK_PACK_COUNT += 1;
                System.out.println("Husband adds 1 pack, MASK_PACK_COUNT = " + MASK_PACK_COUNT);
            }
            System.out.println("Before Thread " + Thread.currentThread().getName());
            waitAtBarrier();
            System.out.println("After Thread " + Thread.currentThread().getName());
            return;
        }
        System.out.println("Before Thread " + Thread.currentThread().getName());
        waitAtBarrier();
        System.out.println("After Thread " + Thread.currentThread().getName());
        synchronized (Shopper.class) {
            MASK_PACK_COUNT *= 3;
            System.out.println("Wife multiple 3 times, MASK_PACK_COUNT = " + MASK_PACK_COUNT);
        }
    }

    static void waitAtBarrier() {
        try {
            BARRIER.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
