/*
 * @Author Baonv11
 * @Date Feb 18, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_2;

import java.util.ArrayList;

public class TestThread {
	static int count = 0;

	/*public synchronized static void plusCount() {
		count++;
	}*/

	/*public static void plusCount() {
		synchronized (TestThread.class) {
			count++;
		}
	}*/

	public void plusCount() {
		Object lock = TestThread.class;
		synchronized (lock) {
			count++;
		}
	}

	public static void main(String[] args) {
		testThread();
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Total is: " + b.total);
		}
	}

	private static void testThread() {
		ArrayList<Thread> list = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			Thread th = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println();
					int i = 0;
					for (; i < 200000; i++) {
//						count++;
						new TestThread().plusCount();
					}
					System.out.println("Thread name " + Thread.currentThread().getName() + ", count = " + count + ", i = " + i);
				}
			});
			th.start();

			list.add(th);
		}

		for (Thread thread : list) {
			try {
				thread.join();
			} catch (InterruptedException ex) {
			}
		}
		System.out.println("count: " + count);
	}
}
