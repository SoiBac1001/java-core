/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread_synchronized;

public class ThreadExample {
	private int count;

	public synchronized void increment() {
		count++;
	}
	
	public void doWork() {
		Thread t1 = new Thread(new Runnable() { // sử dụng lớp nặc danh

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() { // sử dụng lớp nặc danh

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join(); // join() giúp cho 2 luồng t1 vs t2 thực hiện xong thì luồng main ở dưới mới chạy
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current thread: " + Thread.currentThread().getName() + ", Count = " + count);
	}
	
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		te.doWork();
	}
}
