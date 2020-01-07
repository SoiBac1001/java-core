/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class Vao_Ra_File {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\os_baonv\\Desktop\\JAVA\\test.txt";
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            sc.close(); // đóng file
        } catch (FileNotFoundException ex) {
            
        }
    }
}
