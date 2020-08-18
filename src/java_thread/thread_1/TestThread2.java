/*
 * @Author Baonv11
 * @Date 15 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_1;

public class TestThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + " " + i); // Lấy tên của Thread
		}
	}
	
	public static void main(String[] args) {
		TestThread2 t1 = new TestThread2();
		t1.setName("Thread1");
		
		/*t1.start();
		t1.setName("ok"); // Set tên Thread
		System.out.println(t1.getName());*/
		
		TestThread2 t2 = new TestThread2();
		t2.setName("Thread2");
		
		TestThread2 t3 = new TestThread2();
		t3.setName("Thread3");
		
		t1.start();
		try {
//			t1.join(); // Các Thread khác đợi Thread 1 hoàn thành xong thì mới thực hiện
			t1.join(1500); // cho Thread 1 chạy trong 1500 millis, chạy hết 1500 millis thì tất các các Thread khác đều chạy
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
