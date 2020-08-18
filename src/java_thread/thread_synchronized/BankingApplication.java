/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread.thread_synchronized;

public class BankingApplication {
	public static void main(String[] args) {
		Account account = new Account(90);
		Customer customer1 = new Customer("Peter", account);
		Customer customer2 = new Customer("David", account);
		
		Thread t1 = new Thread(customer1);
		Thread t2 = new Thread(customer2);
		
		t1.start();
		t2.start();
	}
}
