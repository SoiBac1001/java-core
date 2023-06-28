package java_thread.volatile_thread;

public class VolatileTest7 {
    private boolean active;
//    private static boolean active;

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
            while (!active) {
            }
            System.out.println("Process thread 1 ..., active: " + active);
            process();

        });
        thread1.setName("thread 1");
        thread1.start();
    }

    public void processThread2(Thread thread3) throws InterruptedException {
        Thread thread2 = new Thread(() -> {
            System.out.println("\nProcess thread 2 ...");
            {
                /*sleep(2);
                active = true;*/
                thread3.start();
            }
            process();
        });

        thread2.setName("thread 2");
        thread2.start();
    }

    public Thread buildThread3() throws InterruptedException {
        return new Thread(() -> {
            System.out.println("\nProcess thread 3 ...");
            while (!active) { // nếu thread 3 read active trước khi thread 2 update active = true
                              // do thread 3 sẽ giữ value active trong CPU cache nên nó luôn luôn read active = false
                              // nếu thread 3 read active sau khi thread 2 update active = true
                              // thì nó sẽ read được active = true từ main memory, do thread 2 đã flush lại active vào main memory sau khi update = true
            }
            System.out.println("Thread 3 with active: " + active);
        });
    }

    public void process() {
        String threadName = Thread.currentThread().getName();
        if (!active) { // sử dụng cái này để ko block thread
            System.out.printf("\nThread name is waiting: %s", threadName);

//            synchronized (this) {
                System.out.printf("\nthread name: %s, active: %s", threadName, active);
                if (!active) {
                    sleep(3);
                    System.out.println("\n\n===================================");
                    System.out.printf("Thread name is working: %s", threadName);
                    System.out.println("\n===================================");
                    active = true; // thread nào update variable active xong thì sẽ flush lại value đó cho main memory
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
        VolatileTest7 example = new VolatileTest7();
        /*example.prepare();
        example.start();
        sleep(10);*/
        example.processThread1();
        /*Thread thread3 = new Thread(() -> {
            System.out.println("\nProcess thread 3 ...");
            if (example.active) {
                System.out.println("Thread 3 with active: " + example.active);
            }
        });*/

        example.processThread2(example.buildThread3());
    }
}
