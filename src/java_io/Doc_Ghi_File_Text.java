/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author 13a0_pr0_96
 */
public class Doc_Ghi_File_Text {
    public static void main(String[] args) {
        File file = new File("output.txt"); // nằm luôn trong thư mục project hiện tại
        try(
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bf = new BufferedWriter(fw); // ghi tiếp ND vào file text
                PrintWriter pw = new PrintWriter(bf)) { // k quan tâm đóng mở file như thế nào, chỉ thao tác ghi thông tin ra file
            pw.println("\nHello World"); // ghi tiếp thông tin vao file
            pw.println("Welcome to Viet Nam");
        } catch (Exception e) {
        }
    }
}
