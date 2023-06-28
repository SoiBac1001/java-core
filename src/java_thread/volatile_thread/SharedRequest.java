package java_thread.volatile_thread;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedRequest {
    // volatile
//    private volatile boolean active;

    // without volatile
    private boolean active;

    private int count;

    // Object
    private final AtomicInteger number = new AtomicInteger();

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getNumber() {
        return number.get();
    }

    public int getAndIncrement() {
        return this.number.getAndIncrement();
    }

    public int getCount() {
        return count;
    }
}
