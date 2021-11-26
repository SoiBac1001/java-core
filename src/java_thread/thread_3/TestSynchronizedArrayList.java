/*
 * @Author Baonv11
 * @Date 9 thg 3, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_3;

import java.util.ArrayList;

public class TestSynchronizedArrayList extends Thread{
  
  private static ArrayList<Integer> arrayList = new ArrayList<>();
  
  public void add() { // Khi chưa có synchronized, hàm add thêm lung tung do ArrayList không có cơ chế đồng bộ hóa (synchronized) ở hàm add (của ArrayList)
    arrayList.add(10); // Luồng thread t1 đang thực hiện thêm thì luồng thread t2 nhảy vào hàm này
    arrayList.add(5);
    arrayList.add(7);
  }
  
  /*public void add() {
    synchronized (arrayList) { // Khi có có synchronized thì từng luồng thực hiện, thực hiện xong thì luồng khác mới nhảy vào thực hiện
      arrayList.add(3);
      arrayList.add(5);
    }   
  }*/
  
  public static void show() {
    System.out.println("List of elements: ");
    for(Integer i : arrayList) {
      System.out.print(i + " ");
    }
  }
  
  @Override
  public void run() {
    System.out.println("====== Thread Name: " + this.getName());
    try {
      int miniSecondWatting;
      if(this.getName().equals("Thread-1")) {
        miniSecondWatting = 1000;
      } else {
        miniSecondWatting = 300;
      }
      Thread.sleep(miniSecondWatting);
      System.out.println("====== Watting: " + this.getName());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    add();
//    show();
    System.out.println("Testing with thread " + this.getId());
  }
  
  public static void main(String[] args) {
    TestSynchronizedArrayList t1 = new TestSynchronizedArrayList();
    TestSynchronizedArrayList t2 = new TestSynchronizedArrayList();
    t1.start();
    t2.start();
    try {
      // thread cha ở đây là Main Thread
      t1.join(); // thông báo rằng hãy chờ thread này hoàn thành rồi thread cha mới được tiếp tục chạy.
//      t2.join(); // dùng join này có tương đương với synchronized khi các luồng được thực hiện tuần tự
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Main Thread Finished");
    
//    show(); // nếu ko có join thì bản chất các câu lệnh trong main thread sẽ chạy liên tục cho đến hết mà ko chờ thread này hoàn thành xong mới chạy thread khác
  }
}
