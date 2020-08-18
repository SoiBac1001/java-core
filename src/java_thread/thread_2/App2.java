/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_2;

class Runner2 implements Runnable{

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

public class App2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner2());
		t1.start();
	}
}
