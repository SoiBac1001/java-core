/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_2;

class Runner extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

/*
 * Nguồn: Giao tiếp giữa các thread trong Java: wait(), notify(), notifyAll()
 * http://viettuts.vn/java-thread/giao-tiep-giua-cac-thread-trong-java
 */
class Customer{
	int balance = 1000;
	public synchronized void withdraw(int amount) {
		System.out.println("Chuan bi rut tien");
		String threadName = Thread.currentThread().getName();
		if(this.balance < amount) {
			System.out.println("\t+ Current thread: " + threadName);
			System.out.println("\t+ Ko du tien, nap them vao !");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance *= 2;
		System.out.printf("\t+ Available balance %s with amount %s%n", threadName, balance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance -= amount;
		System.out.printf("\t+ Rut tien thanh cong for %s with amount %s%n", threadName, balance);
	}

	public synchronized void countMoney() {
		System.out.println("Count money");
		System.out.println("\t+ Current thread: " + Thread.currentThread().getName());
		/*try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		System.out.println("More money !");
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Chuan bi nap tien");
		System.out.println("\t+ Current thread: " + Thread.currentThread().getName());

		try { // đặt thread ở đây thì tất cả các luồng mà dùng đến shared resource thì đều sleep ?, chứ ko phải luồng đang vào sleep
			Thread.sleep(3000); // ko đúng - chỉ có current thread dùng tới hàm này sleep thôi
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance += amount;
		System.out.println("\t+ Nap thanh cong !");

//		notify(); // KO notify thì cứ wait mãi ở trên // đánh thức object đang ở trạng thái wait() // đánh thức 1 thread bất kỳ
		 notifyAll(); // đánh thức tất cả object đang ở trạng thái wait() // đánh thức tất cả các thread => khi đó các thread vẫn thực hiện synchronized trở lại
		// đang có thread thao tác với shared resource thì những thread khác sẽ ko được thao tác với shared resource đó nữa
	}
}

public class App {
	public static void main(String[] args) {
		/*Runner runner = new Runner();
		runner.start();*/
		
		Customer c = new Customer();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("T1");
				c.withdraw(3000);
				System.out.println("[withdraw T1] available balance with  " + c.balance);
			}
		};

		Thread t3 = new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("T3");
				c.withdraw(5000);
				System.out.println("[withdraw T3] available balance " + c.balance);
			}
		};

		Thread t4 = new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("T4");
				c.countMoney();
				System.out.println("[Counting T4]");
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("T2");
				/*try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				c.deposit(100000);
				System.out.println("[Deposit T2] available balance " + c.balance);
			}
		};
		
		t3.start();
		t1.start();
		t4.start();
		t2.start();
	}
}
