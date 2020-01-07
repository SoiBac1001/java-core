/*
 * @Author Baonv11
 * @Date 9 thg 3, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread_3;

import java.util.Enumeration;
import java.util.Vector;

public class TestThreadVector extends Thread{

  private static Vector<Integer> vector = new Vector<>();
  
  public void add() {
    vector.addElement(new Integer(1));
    vector.addElement(new Integer(3));
  }
  
  public static void show() {
    Enumeration<Integer> e = vector.elements();
    System.out.print("Cac phan tu trong vector: ");
    while(e.hasMoreElements()) {
      System.out.print(e.nextElement() + " ");
    }
  }
  
  @Override
  public void run() {
    add();
  }
  
  public static void main(String[] args) {
    TestThreadVector t1 = new TestThreadVector();
    TestThreadVector t2 = new TestThreadVector();
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
