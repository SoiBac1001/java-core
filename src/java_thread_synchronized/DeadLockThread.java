/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread_synchronized;

public class DeadLockThread implements Runnable{

	// thread t2 chiếm giữ hàm test1()
	public synchronized void test1() {
		System.out.println("Test 1");
		test2();
	}
	
	// thread t1 chiếm giữ hàm test2()
	public synchronized void test2() {
		System.out.println("Test 2");
		test1();
	}
	
	@Override
	public void run() {
		test1();
	}
	
	public static void main(String[] args) {
		DeadLockThread d = new DeadLockThread();
		
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
	}
}
