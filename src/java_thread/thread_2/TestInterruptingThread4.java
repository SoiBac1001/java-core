/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_2;

public class TestInterruptingThread4 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=2; i++) {
			if(Thread.interrupted()) {
				System.out.println("Thread bị gián đoạn...");
			}else {
				System.out.println("Thread binh thuong");
			}
		}
	}
	
	public static void main(String[] args) {
		TestInterruptingThread4 t1 = new TestInterruptingThread4();
		TestInterruptingThread4 t2 = new TestInterruptingThread4();
		t1.start();
		t1.interrupt();
		t2.start();
	}
}
