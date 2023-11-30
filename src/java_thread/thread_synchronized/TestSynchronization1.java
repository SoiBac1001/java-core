/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;
/* Nguồn: http://viettuts.vn/java-thread/phuong-thuc-dong-bo-trong-java
 * Đồng bộ trong java (Synchronization in java) là khả năng kiểm soát truy cập của nhiều luồng đến bất kỳ nguồn tài nguyên chia sẻ (shared resource).
 * Hàm synchronized: nếu t1 truy xuất vào hàm này trước thì nó sẽ chiếm giữ hàm này và nó khóa lại, nếu t2 cũng truy xuất vào thì nó phải đợi t1 thực hiện xong thì t2 mới được thực hiện
 */
public class TestSynchronization1 {
	public static void main(String[] args) {
		Table table = new Table();
		Table table1 = new Table();
		Table table2 = new Table();
		MyThread1 t1 = new MyThread1(table, "Thread T1");
//		MyThread1 t1 = new MyThread1(table);

		MyThread2 t2 = new MyThread2(table2);
		MyThread2 t3 = new MyThread2(table2, 50);
		t2.setName("Thread T2");

		t1.start();
		t3.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
