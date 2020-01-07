/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread;
/* Interrupt một thread trong java làm gián đoạn một luồng trong java
 * Nếu thread nằm trong trạng thái sleep hoặc wait (nghĩa là sleep() hoặc wait() được gọi ra), việc gọi phương thức interrupt() trên thread đó sẽ phá vỡ trạng thái sleep hoặc wait và ném ra ngoại lệ InterruptedException
 */
public class Interruption {

	public static void main(String[] args) {
		BankingThread bt = new BankingThread();
		bt.setName("SB");
		bt.start();
	}

}

class BankingThread extends Thread{
	@Override
	public void run() {
		int count = 0;
		while(count++ < 5) {
			try {
				Thread.sleep(1000);
				if(count == 3){
					this.interrupt(); // Làm gián đoạn một luồng trong java // KO cần sleep nữa, dậy làm gì đó luôn.
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
//			System.out.format("Customer Thread %s is running\n", Thread.currentThread().getName());
			System.out.format("Banking Thread %s is running %d\n", this.getName(), count);
		}
	}
}
