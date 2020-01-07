/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io_doc_ghi_du_lieu_object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author os_baonv
 */
public class Doc_File {
    public Object doc(String name){
        Object o = new Object();
        try(FileInputStream fis = new FileInputStream(name)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = ois.readObject();
        } catch (Exception e) {
            System.out.println("Co loi...");
        }
        return o;
    }
    
    public ArrayList docDS(String name){
        ArrayList list = new ArrayList<Object>();
        try(FileInputStream fis = new FileInputStream(name)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList) ois.readObject();
        } catch (Exception e) {
            System.out.println("Co loi...");
        }
        return list;
    }
    
    public static void main(String[] args) {
        Doc_File df = new Doc_File();
        SinhVien s = (SinhVien) df.doc("ketqua.co");
        ArrayList<SinhVien> list = new ArrayList<>();
        list = df.docDS("ketqua.txt");
        System.out.println("Thong tin sinh vien trong file ketqua.co:");
//        System.out.println(s.getTen() + ", " + s.getTuoi() + ", " + s.getDiaChi() + ", " + s.getDiemTB());
        System.out.println(s);
        
        System.out.println("\n======\nThong tin danh sach sinh vien trong file ketqua.txt:");
//        for(int i = 0; i<list.size(); i++){
//            System.out.println(list[i].getTen() + ", " + list[i].getTuoi() + ", " + list[i].getDiaChi() + ", " + list[i].getDiemTB());
//        }   
        for(SinhVien s1: list)
            System.out.println(s1.getTen() + ", " + s1.getTuoi() + ", " + s1.getDiaChi() + ", " + s1.getDiemTB());
    }
}
