package java_thread.volatile_thread;

public class VolatileTest6 {
    // volatile
    private volatile boolean active;

    // without volatile
//    private boolean active;

    // static variable
//    private static boolean active;

    private final SharedRequest sharedRequest = new SharedRequest();
//    private final SharedRequest2 sharedRequest = new SharedRequest2();

    public void prepare() throws InterruptedException {
        new Thread(() -> {
            System.out.println("application preparing ...");
            sleep(3);
            active = true;
        })
                .start();
    }

    public void start() throws Exception {
        new Thread(() -> {
            while(!active);
            System.out.println("application started");
        })
                .start();
    }

    public void processThread1() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
//            sleep(4); // with sleep thread, i don't need volatile for active variable
            // Because after sleep, this thread will flush all cache memory
            while (sharedRequest.getNumber() == 0) {
                // trong hàm này có use keyword synchronized => khi run qua synchronized nó sẽ flush lại cache memory của thread đó
                // => get được isActive = true
//                System.out.print("");
                int b = 0;
            }
            System.out.println("Process thread 1 ...");
            process();

        });
        thread1.setName("thread 1");
        thread1.start();
    }

    public void processThread2() throws InterruptedException {
        Thread thread2 = new Thread(() -> {
            System.out.println("\nProcess thread 2 ...");
            process();
        });
        thread2.setName("thread 2");
        thread2.start();
    }

    public void process() {
        String threadName = Thread.currentThread().getName();
        if (sharedRequest.getNumber() == 0) { // sử dụng cái này để ko block thread
            System.out.printf("\nThread name is waiting: %s", threadName);

//            synchronized (this) {
            System.out.printf("\nthread name: %s, active: %s", threadName, sharedRequest.isActive());
            if (sharedRequest.getNumber() == 0) {
                sleep(3);
                System.out.println("\n\n===================================");
                System.out.printf("Thread name is working: %s", threadName);
                System.out.println("\n===================================");
//                active = true;
                sharedRequest.getAndIncrement();
            }
//            }
        }

        System.out.printf("\nEnd process with threadName: %s !\n", threadName);
    }

    private static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        VolatileTest6 example = new VolatileTest6();
        /*example.prepare();
        example.start();
        sleep(10);*/
        example.processThread1();
        example.processThread2();
    }

    static class SharedRequest2 {
        // volatile
//    private volatile boolean active;

        // without volatile
        private boolean active;

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }
}