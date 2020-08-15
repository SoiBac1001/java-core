/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author os_baonv
 */
public class File_Writer {
    public static void main(String[] args) {
        
        try {
            File file = new File("test.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String data = "Today is 26-7-2018";
            bw.write(data);
            bw.close();
            fw.close();
        } catch (IOException ex) {
//            Logger.getLogger(File_Writer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        
        /*
        try {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Welcome to java !");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Success");
        */
    }
}
