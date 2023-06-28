package java_thread.volatile_thread;

public class VolatileTest1 {
//    private volatile boolean active;

    // without volatile
//    private boolean active;

    // static variable
    private static boolean active;

    public void prepare() throws InterruptedException {
        new Thread(() -> {
//            System.out.println("application preparing ...");
//            sleep(2);
            active = true;
        })
                .start();
    }

    public void start() throws Exception {
        new Thread(() -> {
            while(!active) {
//                System.out.print("");
            }
            System.out.println("application started, active: " + active);
        })
                .start();
    }

    private static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        VolatileTest1 example = new VolatileTest1();
        example.prepare();
        example.start();
//        sleep(10);
    }
}
