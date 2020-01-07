/*
 * @Author Baonv11
 * @Date 16 thg 2, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_thread_synchronized;

import java.util.concurrent.TimeUnit;

public class Account {
	private int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(String name, int money) {
		int count = 0;
		while(count++ < 1) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " withdrawing");
		}
		
		if(balance >= money) {
			balance -= money;
			System.out.println(name + " succeeded " + balance);
		}else {
			System.out.println(name + " enough money " + balance);
		}
		System.out.println();
	}
}
