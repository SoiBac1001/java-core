/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;

public class MyThread2 extends Thread{
	int number = 5;
	Table t;

	public MyThread2(Table t) {
		super();
		this.t = t;
	}

	public MyThread2(Table t, int number) {
		super();
		this.t = t;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public void run() {
//		t.printTable(100);
		System.out.println("number - " + number);
	}
}
