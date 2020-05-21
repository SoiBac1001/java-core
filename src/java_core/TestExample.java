/*
 * @Author Baonv11
 * @Date 9 thg 3, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
/**
 * Nguồn: https://chauquochieu.wordpress.com/2011/11/03/integer-int/
 */

package java_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExample {
  public static void main(String[] args) {
	  int[] array1 = {1, 2, 3};
	  System.out.println(array1);
	  int[] array2 = {5, 6, 7, 8};
	  array1 = new int[] {5, 6, 7, 8};
    int a1 = 1000, a2 = 1000;
    System.out.println(array1);
    System.out.println(a1 == a2); // true
    
    Integer b1 = 1000, b2 = 1000; // KO THUỘC (-128; 127) => tạo ra 2 đt Integer => so sánh == ở đây là so sánh địa chỉ của nó
    System.out.println(b1 == b2); // false
    
    Integer c1 = 100, c2 = 100; // THUỘC (-128; 127) // Không khởi tạo bằng toán tử New thì JVM sẽ coi là khởi tạo 2 số int, chứ không phải là Interger
    System.out.println(c1 == c2); // true
    System.out.println("Oh no");
    
    System.out.println("======================");
    List<Integer> abc = new ArrayList<Integer>();
	abc.add(1);
	abc.add(1);
	abc.add(3);
	for(int i : abc) {
		System.out.print(i + " ");
	}
	System.out.println("\n======================");
	
	// Creating arraylist
    List<String> list = new ArrayList<String>();
    // Add objects to arraylist
    list.add("Java");
    list.add("C++");
    list.add("PHP");
    list.add("Java"); 
    System.out.println("The list is:" + list);
    for(String str: list){
        System.out.println(str + " ");
    }
    System.out.println("======================");
    
    String a[] = new String[] {"abc", "xyz", "mnq", "opm"};
    List<String> list2 = Arrays.asList(a);
    System.out.println(list2);
    for(String str: list2){
        System.out.println(str + " ");
    }
  }
}
