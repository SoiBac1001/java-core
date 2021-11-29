package java_thread.thread_3;

public class StarManagement {
    // đọc bài này: https://www.javatpoint.com/static-synchronization-example
    public static void main(String[] args) {
        Star star = new Star();
        TestSynchronizedArrayList t1 = new TestSynchronizedArrayList(star);
        TestSynchronizedArrayList t2 = new TestSynchronizedArrayList(star);
        t1.start();
        t2.start();
    /*try {
      // thread cha ở đây là Main Thread
      t1.join(); // thông báo rằng hãy chờ thread này hoàn thành rồi thread cha mới được tiếp tục chạy.
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }*/

        System.out.println("Main Thread Finished");

//    show(); // nếu ko có join thì bản chất các câu lệnh trong main thread sẽ chạy liên tục cho đến hết mà ko chờ thread này hoàn thành xong mới chạy thread khác
    }
}
