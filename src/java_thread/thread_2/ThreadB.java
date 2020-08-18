/*
 * @Author Baonv11
 * @Date Feb 18, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_2;

public class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<100; i++) {
				total += i;
			}
			notify();
		}
	}
}
