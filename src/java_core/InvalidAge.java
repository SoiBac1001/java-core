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
public class InvalidAge {
    static void validate(int age) throws InvalidAgeException{
        if(age < 18)
            throw new InvalidAgeException("Em chua 18, moi co: " + age);
        else
            System.out.println("Welcome !");
    }
    
    public static void main(String[] args) {
        try {
            validate(18);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage()); // getMessage() ở dòng 18
        }
    }
}
