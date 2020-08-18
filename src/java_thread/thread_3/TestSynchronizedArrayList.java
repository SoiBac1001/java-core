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
  
  /*public void add() { // Khi chưa có synchronized, hàm add thêm lung tung do ArrayList không có cơ chế đồng bộ hóa (synchronized) ở hàm add (của ArrayList)  
    arrayList.add(3); // Luồng thread t1 đang thực hiện thêm thì luồng thread t2 nhảy vào hàm này
    arrayList.add(5);
  }*/
  
  public void add() { 
    synchronized (arrayList) { // Khi có có synchronized thì từng luồng thực hiện, thực hiện xong thì luồng khác mới nhảy vào thực hiện
      arrayList.add(3);
      arrayList.add(5);
    }   
  }
  
  public static void show() {
    System.out.println("List of elements: ");
    for(Integer i : arrayList) {
      System.out.print(i + " ");
    }
  }
  
  @Override
  public void run() {
    add();
  }
  
  public static void main(String[] args) {
    TestSynchronizedArrayList t1 = new TestSynchronizedArrayList();
    TestSynchronizedArrayList t2 = new TestSynchronizedArrayList();
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    show();
  }
}
