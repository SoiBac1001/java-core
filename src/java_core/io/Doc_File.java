/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class Doc_File {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null;
        // VD 1: đọc 1 ký tự. File output.txt có nội dung: Welcome to java.
        /*
        try {
            fin = new FileInputStream("output.txt");
            int i = fin.read(); // đọc byte dữ liệu từ file input stream
            System.out.println((char)i); // Ta nhận được một ký tự duy nhất từ file đó là 87 (dưới dạng byte)
            fin.close();                // Để xem đó là ký tự gì, bạn cần phải chuyển đổi nó thành kiểu dữ liệu char.
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            fin.close();
        }
        */
        
        
        // VD 2: đọc toàn bộ nội dung file
        try {
            fin = new FileInputStream("output.txt");
            int i=0;
            while((i = fin.read()) != -1) // Nếu cuối luồng sẽ trả về -1
                System.out.print((char)i);
            System.out.println("");
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            fin.close();
        }
        
    }
}
