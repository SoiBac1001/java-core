/*
 * @Author Baonv11
 * @Date 14 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread;
/*
 * Nguồn: http://viettuts.vn/java-thread/tao-thread-trong-java
 * https://www.youtube.com/watch?v=Bs5tciqHtCY&list=PLsfLgp1K1xQ4ukX-Y7w5i76eJkApL641w&index=73
 */
public class MyThread1 implements Runnable{

	@Override
	public void run() { // Được sử dụng để thực hiện hành động cho một thread
		for(int i=0; i<10; i++) {
			System.out.println("A " + i);
		}
	}

}
