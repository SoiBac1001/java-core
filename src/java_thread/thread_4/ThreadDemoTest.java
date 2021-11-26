package java_thread.thread_4;

public class ThreadDemoTest {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        ThreadDemo t1 = new ThreadDemo("Thread 1");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread 1");
        t2.start();
        System.out.println("Main thread stopped!!! ");
    }
}
