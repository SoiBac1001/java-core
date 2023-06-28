package java_thread.volatile_thread;

public class VolatileTest3 {
    private static boolean ready = false;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(){
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

        Thread t2 = new Thread(){
            @Override
            public void run() {
                while(!ready){
                    System.out.println("invoking..");
                }
                System.out.println("I was finished, ready: " + ready);
            }
        };

        t2.start();
        t1.start();
    }
}
