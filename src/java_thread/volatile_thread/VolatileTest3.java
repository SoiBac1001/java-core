package java_thread.volatile_thread;

public class VolatileTest3 {
    private static boolean ready = false;
    private static int count;

    private static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                ready = true;
                int sum = 0;
                /*for(int i=1; i<10000000; i++) {
                    int result = sum+=i;
                    int i1 = result % i;
                }*/
                count = 3; // sau khi count xong thread sẽ flush lại value count vào main memory (kể cả count là static hay non-static variable)
                           // thì nếu thread nào có update shared variable nó sẽ flush lại giá trị vào main memory
                System.out.println("\nt1 thread should stop!");
//                VolatileTest3.sleep(5);
//                count = 7; // sau khi count xong thread sẽ flush lại value count vào main memory
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread 2 running");
                while(!ready){
//                while(count == 0){
//                    System.out.println("invoking..");
                }
                System.out.printf("\nI was finished, ready: %s, count: %s", ready, count);
                count = 5;
                VolatileTest3.sleep(2);
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread 3 running");
                if (count == 3 || count == 5) {
                    System.out.println("value of count is flushed to main memory, count: " + count);
                }
            }
        };

        t2.start();
        t1.start();
//        t3.start();
    }
}
