/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author os_baonv
 */
public class Line_Oriented_IO {
    public static void main(String[] args) throws IOException {
        String file = "output.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap:");
        FileWriter fw = new FileWriter(file);
        while(true){
            String input = sc.nextLine();
            if("DONE".equalsIgnoreCase(input.trim())) // so sánh k phân biệt chữ hoa, chữ thường
                break;
            fw.write(input + "\n"); // ghi dữ liệu
        }
        sc.close();
        fw.close();
    }
}
