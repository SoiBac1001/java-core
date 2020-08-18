/*
 * @Author Baonv11
 * @Date 14 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_1;
/*
 * Nguồn: http://viettuts.vn/java-thread/phuong-thuc-sleep-trong-java
 * + Phương thức sleep() của lớp Thread được sử dụng để tạm ngứng một thread cho một khoảng thời gian nhất định.
 */
public class TestThread extends Thread{
	private String threadName;
	
	public TestThread(String threadName) {
		super();
		this.threadName = threadName;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {			
		for(int i=0; i<10; i++) {
			System.out.println(getThreadName() + i);
			try { // 1s = 1000 millis
				Thread.sleep(1000); // Cho Thread ngủ đông // Làm cho thread hiện tại tạm ngừng thực thi cho số mili giây quy định.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TestThread t1 = new TestThread("a");
		TestThread t2 = new TestThread("b");
		
		// Các thread chạy song song với nhau
		/*t1.start();
		t2.start();*/
		
		System.out.println(t1.getName());
	}
}
