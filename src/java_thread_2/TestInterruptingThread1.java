/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread_2;

public class TestInterruptingThread1 extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted...\n");
//			System.out.println("Exception handled " + e);
		}
		
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		TestInterruptingThread1 t1 = new TestInterruptingThread1();
		t1.start();
		t1.interrupt();
	}

}
