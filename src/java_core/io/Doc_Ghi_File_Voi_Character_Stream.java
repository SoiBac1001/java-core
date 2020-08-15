/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class Doc_Ghi_File_Voi_Character_Stream {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("C:\\Users\\SoiBac1001\\Desktop\\JAVA\\abc.txt");
            out = new FileWriter("C:\\Users\\SoiBac1001\\Desktop\\JAVA\\output.txt");
            int c;
            while((c = in.read()) != -1) // Đọc một ký tự và gán cho c. Trả về -1 nếu cuối luồng.
            	System.out.print((char) c);
                out.write(c); // Ghi ký tự c được biểu diễn bằng số nguyên
        } finally { // throws (ném ra ngoại lệ) thì k cần phải catch nữa
            if(in != null)
                in.close(); // đóng luồng
            if(out != null)
                out.close(); // đóng luồng
        }
    }
}
