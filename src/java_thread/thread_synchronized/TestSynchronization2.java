/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;

// synchronized method sử dụng lớp nặc danh
public class TestSynchronization2 {
	public static void main(String[] args) {
		Table table = new Table();
		Thread t1 = new Thread() {
			public void run() {
				table.printTable(5);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				table.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}
}
