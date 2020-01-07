/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread;

import java.util.concurrent.TimeUnit;

public class ThreadSample {
	public static void main(String[] args) {
		CustomerThread customerThread = new CustomerThread();
		customerThread.setName("A");
		
		CustomerThread customerThread2 = new CustomerThread();
		customerThread2.setName("B");
		
		customerThread.start();
//		customerThread.run();
//		customerThread.run();
		customerThread2.start();
		
		System.out.println(customerThread.isAlive());
	}
}

class CustomerThread extends Thread{
	@Override
	public void run() {
		int count = 0;
		while(count++ < 1) {
			try {
//				Thread.sleep(500);
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.format("Customer Thread %s is running\n", Thread.currentThread().getName());
//			System.out.format("Customer Thread %s is running %d\n", this.getName(), count);
		}
	}
}
