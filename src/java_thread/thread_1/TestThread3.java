/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_1;

public class TestThread3 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(this.getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		TestThread3 t1 = new TestThread3();
		TestThread3 t2 = new TestThread3();
		TestThread3 t3 = new TestThread3();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		System.out.println(t1.getName());
		
		t1.setPriority(1); // Mức ưu tiên của một Thread KO đảm bảo thứ tự chạy của Thread
		t2.setPriority(10);
		t3.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
		
		// deamon thread: là những thread chạy ở background // là những thread chạy ngầm: như chương trình dọn rác,...
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}
