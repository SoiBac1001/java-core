/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class File_Co_Ban {
    public static void main(String[] args) throws IOException {
        /*
        File file = new File("demo.txt"); // đường dẫn chứa project hiện tại
        try {
            file.createNewFile(); // tạo file
            File thuMuc = new File("new");
            thuMuc.mkdir(); // tạo thư mục
        } catch (IOException ex) {
            Logger.getLogger(File_Co_Ban.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        // Write byte
/*
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\output.txt");
            fout.write(65); // ghi ký tự 65 (ky tu duoi dang byte) vào file output.txt
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            fout.close(); // close file output stream
        }
*/        
        // Write String
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("C:\\Users\\SoiBac1001\\Desktop\\JAVA\\output.txt");
            String s = "Welcome to java";
            byte b[] = s.getBytes(); // converting String into byte array
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            fout.close();
        }
    }
}
