/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class Doc_File_Voi_BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        try {
            fin = new FileInputStream("demo.txt");
            bin = new BufferedInputStream(fin);
            int i;
            while((i = bin.read()) != -1) // Đọc một ký tự và gán cho i. Trả về -1 nếu cuối luồng.
                System.out.print((char) i); // Hiển thị ký tự i (ép kiểu về kiểu ký tự)
        } catch (IOException e) {
            System.out.println(e);
        } finally{
            bin.close();
            fin.close();
        }
    }
}
