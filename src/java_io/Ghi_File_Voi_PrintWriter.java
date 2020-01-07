/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author os_baonv
 */
public class Ghi_File_Voi_PrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        // Dữ liệu được ghi trên Console sử dụng lớp PrintWriter
        PrintWriter pw = new PrintWriter(System.out);
        pw.write("Oh my god !");
        pw.flush();
        pw.close();
        
        PrintWriter pw1 = new PrintWriter("demo.txt");
        pw1.write("Java, Spring, Hibernate,...");
        pw1.flush();
        pw1.close();
    }
}
