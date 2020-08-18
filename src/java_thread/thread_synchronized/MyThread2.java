/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;

public class MyThread2 extends Thread{
	Table t;

	public MyThread2(Table t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(100);
	}
}
