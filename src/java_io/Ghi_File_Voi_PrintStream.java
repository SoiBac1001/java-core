/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author os_baonv
 */
public class Ghi_File_Voi_PrintStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("demo.txt");
        PrintStream pout = new PrintStream(fout);
        pout.println(2018);
        pout.println("Hello World !"); // ghi dữ liệu vào file demo.txt có xuống dòng
        pout.println("Welcome to Viet Nam");
        pout.close();
        fout.close();
        System.out.println("Success...");        
    }
}
