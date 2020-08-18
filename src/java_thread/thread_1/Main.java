/*
 * @Author Baonv11
 * @Date 14 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_1;
/* Nguồn: http://viettuts.vn/java-thread/tao-thread-trong-java
 * Có hai cách để tạo ra một thread:
   1. Bởi extends lớp Thread
   2. Bởi implements Runnable interface.
 */
public class Main {

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Thread t = new Thread(m1, "test");
		
		MyThread2 m2 = new MyThread2();
		Thread t2 = new Thread(m2, "ok");
		
		MyThread2 m3 = new MyThread2();
		/*m2.run(); // không có sự chuyển đổi ngữ cảnh vì ở đây m2 và m3 sẽ được coi như đối tượng thông thường chứ không phải đối tượng luồng.
		m3.run();*/
		
		// Các thread chạy song song với nhau
//		t.start(); // Bắt đầu thực hiện thread. JVM gọi phương thức run() trên thread.
//		t.start(); // KO thể start một thread hai lần
		m2.start();
		m3.start();
		
		System.out.println(t.getName());
//		System.out.println(m2.getName());
		System.out.println(t2.getName());
	}

}
