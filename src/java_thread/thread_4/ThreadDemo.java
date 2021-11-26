package java_thread.thread_4;

public class ThreadDemo extends Thread {
    private String threadName;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 4; i >= 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }

        System.out.println("Thread " + threadName + " exiting.");
    }
}
