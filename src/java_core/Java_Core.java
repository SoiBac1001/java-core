/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author os_baonv
 */
public class Java_Core {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    	double d = 20000000000d;
//    	DecimalFormat decimalFormat = new DecimalFormat("#,##0.0");
    	DecimalFormat decimalFormat = new DecimalFormat("###,###,##0.00");
    	String result = decimalFormat.format(d);
    	System.out.println(result);
    	System.out.println("=================");
    	
    	/*int a = 01;
    	System.out.println(a);
        System.out.println("simple message");
        System.err.println("error message");
        int m = 'A' +5;
        System.out.println(m);
        int k;
        System.out.println("Nhap ky tu bat ky: ");
        k = System.in.read();
        System.out.println((char) k);
        int input = 0;
        for(int i=0; i<10; i++){
            input = getUserInput();
            System.out.println("user value: " + input);
        }*/
    }
    
    public static int getUserInput(){
        int value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your value: ");
        value = sc.nextInt();
        return value;
    }
    
    public static double roundDouble(double n, int d) {
        double ret = n;
        double x = Math.pow(10, d);
        ret = Math.floor((n * x) + 0.5000000001)/x;
        return ret;
    }
}
