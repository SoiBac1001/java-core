/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io_doc_ghi_du_lieu_object;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Ghi_File {
    
    public void ghi(Object o, String name){
        try(FileOutputStream fos = new FileOutputStream(name)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o);
        } catch (Exception e) {
            System.out.println("Co loi...");
        }    
    }
    
//    public void ghiDS(Object[] list, String name) // ghi 1 mảng các đối tượng
    public void ghiDS(List list, String name){
        try(FileOutputStream fos = new FileOutputStream(new File(name))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Co loi...");
        }    
    }
    
    public void writetoConsole(String str){ 
        /*
        BufferedOutputStream output = new BufferedOutputStream(System.out);
        try {
            byte b[] = str.getBytes();
            output.write(b);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Ghi_File.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        DataOutputStream out = new DataOutputStream(System.out);
        try {
            byte b[] = str.getBytes();
            out.write(b);
        } catch (IOException ex) {
            Logger.getLogger(Ghi_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeToFile(String fileName, String str){       
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream(fileName));
//            output.writeUTF(str);
            byte b[] = str.getBytes();
            output.write(b);
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Ghi_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void writeObjiectToFile(String fileName, Object o){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(o);
        } catch (IOException ex) {
            Logger.getLogger(Ghi_File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new SinhVien(22, "le tung lam", "ha noi", 7.5));
        list.add(new SinhVien(20, "nguyen van hai", "ha noi", 8));
        list.add(new SinhVien(22, "hoang cuong", "hcm", 7.9));
        list.add(new SinhVien(22, "nguyen khuyen", "da nang", 6.5));
        list.add(new SinhVien(22, "manh hung", "nghe an", 8.5));
        Ghi_File io = new Ghi_File();
        io.ghi(new SinhVien(22, "le tung lam", "ha noi", 7.5), "ketqua.co");
        io.ghiDS(list, "ketqua.txt");
        
//        io.writetoConsole("Hello Everyone!\n");
//        io.writeToFile("demo.txt", "Hello World!");
//        io.writeObjiectToFile("test.txt", new SinhVien(10, "Le Hai Nam", "Ha Noi", 9));
    }
}
