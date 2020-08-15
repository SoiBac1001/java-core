/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class VD_Luong_Byte {
    public static void main(String[] args) {
        FileInputStream in = null; // dùng để đọc các byte từ một tập tin
        FileOutputStream out = null; // dùng để ghi các byte xuống tập tin
        try {
            in = new FileInputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\input.txt");
            out = new FileOutputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\output.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        int c;
        try {
            while((c = in.read()) != -1) // :Đọc một byte từ luồng. Nếu cuối luồng sẽ trả về -1 
                out.write(c); // ghi byte dữ liệu c vào file out
            if(in != null)
                in.close(); // đóng luồng
            if(out != null) // đóng luồng
                out.close();
        } catch (IOException ex) { // không có throws (ném ra ngoại lệ) ở trên hàm thì cần phải catch lại
            System.out.println(ex);
        }
        
        try {
            System.out.print("Moi ban nhap ky tu: ");
            int i = System.in.read();
            System.out.println("Ky tu ban vua nhap: " + (char) i);
        } catch (IOException ex) {
            Logger.getLogger(VD_Luong_Byte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Console test = System.console();
            System.out.println("Enter your name: ");
//            test.flush();
            String n = test.readLine();
            System.out.println("Welcome " + n);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
