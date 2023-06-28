package java_thread.volatile_thread;

public class VolatileTest4 {
    private static boolean ready = false;

    private static volatile int notReadies = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 1; i++) {
            ready = false;

            Thread t1 = new Thread() {
                @Override
                public void run() {
                    ready = true;
                    System.out.println("t2 thread should stop!");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Thread t2 = new Thread() {
                @Override
                public void run() {
                    if (!ready) {
                        notReadies++;
                    }
                    while (!ready) {
                        System.out.println("invoking..");
                    }
                    System.out.println("I was finished");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            t2.start();
            t1.start();
            // To reduce total test run time, reduce the sleep in t1 to a
            // more suitable value like "100" instead of "5000".
            t1.join();
            System.out.println("oh");
            t2.join();
            System.out.println("yeah !");
        }
        System.out.println("Notreadies: " + notReadies);

    }
}
