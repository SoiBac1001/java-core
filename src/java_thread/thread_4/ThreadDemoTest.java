package java_thread.thread_4;

/**
 * Source: https://gpcoder.com/3484-lap-trinh-da-luong-trong-java-java-multi-threading/#Vong_doi_cac_trang_thai_cua_mot_Thread_trong_java
 */
public class ThreadDemoTest {
    public static void main(String[] args) {
        System.out.println("======= Main thread running... =======");
        for(int i = 0; i < 5; i++) {
            ThreadDemo t = new ThreadDemo("Thread " + i);
//            t.setPriority(i);
            t.start();
        }

        /*ThreadDemo t1 = new ThreadDemo("Thread 1");
        t1.start();

        ThreadDemo t2 = new ThreadDemo("Thread 2");
        t2.start();*/
        System.out.println("======= Main thread stopped!!! =======");
    }
}
