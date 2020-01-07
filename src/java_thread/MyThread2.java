/*
 * @Author Baonv11
 * @Date 14 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("B " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
