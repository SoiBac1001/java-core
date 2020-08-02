/*
 * @Author Baonv11
 * @Date Feb 20, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_core.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Java_Date {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		System.out.println(localDate);
		System.out.println(year);
		System.out.println("=========");
		
		Scanner sc = new Scanner(System.in);
		String dateNow = "";
		while(true) {
			System.out.print("Enter date: ");
			dateNow = sc.nextLine();
			if(checkDate(dateNow)) {
				System.out.println("\n=====\nDate: " + dateNow);
				break;
			}else {
				continue;
			}
		}
	}
	
	public static boolean checkDate(String dateNow) {
		// Chuyển đổi string thành date
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = sdf.parse(dateNow);
//			dateNow = sdf.format(date);
			return true;
		} catch (ParseException e) {
			System.out.println("Date is invalid ! Ex: 20/12/2018");
		}
		return false;
	}
}
