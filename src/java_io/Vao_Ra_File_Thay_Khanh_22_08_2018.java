/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_io_doc_ghi_du_lieu_object.SinhVien; // import (tên gói).(tên class)

/**
 *
 * @author 13a0_pr0_96
 */
public class Vao_Ra_File_Thay_Khanh_22_08_2018 {
    public static int readFromKeyBoard(){
        try {
            InputStream in = new BufferedInputStream(System.in);
            int tmp = in.read();     
            in.close();
            return tmp;
        } catch (IOException ex) {
            Logger.getLogger(Vao_Ra_File_Thay_Khanh_22_08_2018.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public static String readFromFile(String fileName) throws IOException{
        DataInputStream in = new DataInputStream(new FileInputStream(fileName));
        String str = "";
        int i = 0;
        while((i = in.read()) != -1){ // Đọc một ký tự rồi cộng vào chuỗi str. Trả về -1 nếu cuối luồng.
            str += (char) i; // in.read() trả về 1 số, số này ứng với 1 ký tự trong bản ASCII
        }
        in.close();
        return str;
    }
    
    public static Object readObjectFromFile(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        return in.readObject();
    }
    
    public static void main(String[] args) throws IOException {
//        readFromKeyBoard();
        String str = readFromFile("demo.txt");
        System.out.println(str);
        try {
            SinhVien s = (SinhVien) readObjectFromFile("ketqua.co");
            System.out.println(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vao_Ra_File_Thay_Khanh_22_08_2018.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vao_Ra_File_Thay_Khanh_22_08_2018.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
