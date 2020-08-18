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
		if(this.balance < amount) {
			System.out.println("Ko du tien, nap them vao !");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.balance -= amount;
		System.out.println("Rut tien thanh cong !");
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Chuan bi nap tien");
		this.balance += amount;
		System.out.println("Nap thanh cong !");
		notify(); // KO notify thì cứ wait mãi ở trên // đánh thức object đang ở trạng thái wait()
		// notifyAll(); // đánh thức tất cả object đang ở trạng thái wait()
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
				c.withdraw(100);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				c.deposit(10000);
			}
		};
		
		t1.start();
		t2.start();
	}
}
