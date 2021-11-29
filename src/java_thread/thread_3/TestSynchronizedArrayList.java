/*
 * @Author Baonv11
 * @Date 9 thg 3, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_3;

import java.util.ArrayList;
import java.util.List;

public class TestSynchronizedArrayList extends Thread{
  private final Star star;
  private static final ArrayList<Integer> arrayList = new ArrayList<>();

  public TestSynchronizedArrayList (Star star) {
    this.star = star;
  }
  
  synchronized public void add() { // Khi chưa có synchronized, hàm add thêm lung tung do ArrayList không có cơ chế đồng bộ hóa (synchronized) ở hàm add (của ArrayList)
    System.out.println("List of elements of thread: " + currentThread().getId());
    List<Integer> arrayList = star.getArrayList();
    arrayList.add(1); // Luồng thread t1 đang thực hiện thêm thì luồng thread t2 nhảy vào hàm này
    arrayList.add(2);
    arrayList.add(3);
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    arrayList.add(4);
    arrayList.add(5);
//    show();

    for(Integer i : star.getArrayList()) {
      System.out.print(i + " ");
    }
  }

  /*synchronized public void add() { // Khi chưa có synchronized, hàm add thêm lung tung do ArrayList không có cơ chế đồng bộ hóa (synchronized) ở hàm add (của ArrayList)
    synchronized (star.getArrayList()) {
      List<Integer> arrayList = star.getArrayList();
      arrayList.add(1); // Luồng thread t1 đang thực hiện thêm thì luồng thread t2 nhảy vào hàm này
      arrayList.add(2);
      arrayList.add(3);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      arrayList.add(4);
      arrayList.add(5);
//    show();

      System.out.println("\nList of elements of thread: " + currentThread().getId());
      for(Integer i : star.getArrayList()) {
        System.out.print(i + " ");
      }
    }
  }*/
  
  /*public void add() {
    synchronized (arrayList) { // Khi có có synchronized thì từng luồng thực hiện, thực hiện xong thì luồng khác mới nhảy vào thực hiện
      arrayList.add(1);
      arrayList.add(2);
      arrayList.add(3);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      arrayList.add(4);
      arrayList.add(5);

      show();
    }
  }*/
  
  public static void show() {
    System.out.println("List of elements of thread: " + currentThread().getId());
    for(Integer i : arrayList) {
      System.out.print(i + " ");
    }
  }

  public void showV2() {
    System.out.println("List of elements of thread: " + currentThread().getId());
    for(Integer i : star.getArrayList()) {
      System.out.print(i + " ");
    }
  }
  
  @Override
  public void run() {
    System.out.println("====== Thread Name: " + this.getName());
    /*try {
      int miniSecondWatting = 1000;
      *//*if(this.getName().equals("Thread-1")) {
        miniSecondWatting = 1000;
      } else {
        miniSecondWatting = 300;
      }*//*
      Thread.sleep(miniSecondWatting);
      System.out.println("====== Watting: " + this.getName());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }*/
    add();
//    System.out.println("\nTesting with thread " + this.getId() + "\n");
  }
}
