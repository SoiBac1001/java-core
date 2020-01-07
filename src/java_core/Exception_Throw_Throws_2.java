/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws_2 {
    public static void main(String[] args) {
        Building b = new Building();
        try {
            b.go();
        } catch (InterruptedException ex) {
            Logger.getLogger(Exception_Throw_Throws_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class MyException extends Exception{ // Tạo class exception riêng
    // Do Something
}

class Building{
    public void show() throws MyException{
        throw new MyException();
    }
    
    public void go() throws InterruptedException{
        Thread.sleep(1000);
    }
}