/*
 * @Author Baonv11
 * @Date Feb 15, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;
/*
 * Phương thúc đồng bộ được sử dụng để khóa một đối tượng cho bất kỳ tài nguyên được chia sẻ.
 * Khi một luồng gọi một phương thức đồng bộ, nó sẽ tự động khóa cho đối tượng đó và giải phóng nó khi luồng hoàn thành nhiệm vụ.
 */

public class Table {
	/*void printTable(int n) { // method ko synchronized
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	/*synchronized void printTable(int n) { // synchronized method
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	void printTable(int n) {
		synchronized (this) { // khối đồng bộ: (synchronized block)
			for(int i=1; i<=5; i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
