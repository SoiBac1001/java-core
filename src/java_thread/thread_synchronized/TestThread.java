/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;

public class TestThread extends Thread{
//	private Integer tong; // ko có static thì mỗi lần tạo 1 thread thì tong là của riêng thread đó
	private static Integer tong; // để biến này là static thì mới gọi là shared resource
	
	public TestThread() {
		super();
		this.tong = 1000;
	}
	
	public synchronized void withdraw() throws InterruptedException { // hàm synchronized: nếu t1 truy xuất vào hàm này trước thì nó sẽ chiếm giữ hàm này và nó khóa lại, nếu t2 cũng truy xuất vào thì nó phải đợi t1 thực hiện xong thì t2 mới được thực hiện
		synchronized (tong) {
			System.out.println("==== Check in ====");
			if(tong > 0) {
				Thread.sleep(3000);
				tong -= 1000;
				System.out.println(tong);
			}else {
				System.out.println("No money !");
			}
		}
	}

	@Override
	public void run() {
		try {
			withdraw();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestThread t = new TestThread();
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
//		Thread t1 = new Thread(t); // t1, t2 cùng truy xuất vào t // nếu KO đồng bộ thì cho ra kq ko phù hợp
//		Thread t2 = new Thread(t);
		
		t1.start();
		t2.start();
	}
}
