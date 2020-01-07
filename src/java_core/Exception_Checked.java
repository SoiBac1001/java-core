/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Exception_Checked {
    
    public static void main(String[] args) {
        try {
            Thread.sleep(1000); // đừng 1000 ms = 1s // tạm ngứng một thread cho một khoảng thời gian nhất định.
            File f = new File("test.txt");
            f.createNewFile();
        } catch (InterruptedException ex) {
            Logger.getLogger(Exception_Checked.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e){
            
        }
    }
}
