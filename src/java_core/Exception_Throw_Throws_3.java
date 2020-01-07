/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws_3 {
    static void validate(int age){
//        try {
            if(age < 18){
                throw new ArithmeticException("not valid");
            }else
                System.out.println("welcome");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
    }
    
    public static void main(String[] args) {
        try {
            validate(19);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
