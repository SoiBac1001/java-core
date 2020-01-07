/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws_4 {
    void m() throws IOException{ // ngoại lệ liên quan đến đọc, ghi
        throw new IOException("Loi thiet bi"); // checked Exception
    }
    
    void n() throws IOException{
        m();
    }
    
    void p(){
        try {
            n();
        } catch (IOException ex) {
//            Logger.getLogger(Exception_Throw_Throws_4.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ngoai le duoc xu ly");
        }
    }
    
    public static void main(String[] args) {
        Exception_Throw_Throws_4 o = new Exception_Throw_Throws_4();
        o.p();
        System.out.println("Luong binh thuong");
    }
}
