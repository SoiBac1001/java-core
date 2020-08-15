/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class Ghi_File_Voi_BufferedOutputStream {
    public static void main(String[] args) throws IOException { // throws: ném cho ngoại lệ IOException xử lý
        FileOutputStream fout = null;
        BufferedOutputStream bout = null;
        try {
            fout = new FileOutputStream("C:\\Users\\os_baonv\\Desktop\\JAVA\\output.txt");
            bout = new BufferedOutputStream(fout);
            String s ="Welcome to Java !";
            byte b[] = s.getBytes(); // converting String into byte array
            bout.write(b); // vì đây là luồng byte => ghi các byte => convert string to byte array
            bout.flush(); // Xả những gì được lưu trong bộ đệm.
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            bout.close();
            fout.close();
        }
    }
}
