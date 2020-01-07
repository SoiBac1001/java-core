/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws {
    void m() throws FileNotFoundException{
        try {
            int a = 1/0;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        FileReader fr = new FileReader("test.txt");
    }
    
    void n() throws FileNotFoundException{
        m();
    }
    
    void p(){
        try {
            n();
        } catch (FileNotFoundException ex) {
            System.out.println("File k tim thay !");
//            Logger.getLogger(Exception_Throw_Throws.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Exception_Throw_Throws test = new Exception_Throw_Throws();
        test.p();
    }
}
