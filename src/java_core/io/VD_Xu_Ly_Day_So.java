/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author os_baonv
 */
public class VD_Xu_Ly_Day_So {
    float t[];
    public float[] doc(){        
        String str = null;
        Scanner in = null;
        try {
            FileInputStream f = new FileInputStream("C:\\Users\\os_baonv\\Documents\\NetBeansProjects\\Java_Core\\VD day so\\input.txt");
            in = new Scanner(f, "UTF-8");
            str = in.nextLine(); // đọc file dayso.txt
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file !");
        }
        String[] temp = null; // mảng String[] temp, độ dài của mảng này là số các số có trong file dayso.txt
        temp = str.split("\\s+"); // tách chuỗi theo biểu thức chính quy (tách không có khoảng trắng
        t = new float[temp.length]; // khai báo 1 mảng int t[] có độ lớn mảng = số các số có trong file dayso.txt
        for(int i=0; i<temp.length; i++)
            t[i] = Float.parseFloat(temp[i]); // chuyển chuỗi thành số
        System.out.println("Read from file success...");
        return t;
    }
    
    public void viet(float result){
        FileOutputStream f;
        PrintWriter out;
        try {
            f = new FileOutputStream("C:\\Users\\os_baonv\\Documents\\NetBeansProjects\\Java_Core\\VD day so\\output.txt");
            out = new PrintWriter(f);
            out.println("Ket qua cong = " + result);
            if(out != null)
                out.close();
        } catch (Exception e) {
        }
    }
    
    public float cong(){
        float result = 0;
        for(float i : t ){
            result += i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        VD_Xu_Ly_Day_So vd = new VD_Xu_Ly_Day_So();
        vd.doc();
        System.out.println("Ket qua cong = " + vd.cong());
        vd.viet(vd.cong());
    }
}
