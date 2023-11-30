/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;

public class MyThread1 extends Thread {
	Table t;

	public MyThread1(Table t) {
		super();
		this.t = t;
	}

	public MyThread1(Table t, String threadName) {
		super(threadName);
		this.t = t;
	}
	
	@Override
	public void run() {
//		System.out.println(this.getName()); // MyThread1 kế thừa Thread thì mới có cái này
//		t.printTable(5);
	}
}
