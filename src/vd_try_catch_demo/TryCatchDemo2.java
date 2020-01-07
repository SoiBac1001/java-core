/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_try_catch_demo;

/**
 *
 * @author os_baonv
 */
public class TryCatchDemo2 {
    public static void main(String[] args) {
        System.out.println("Start Recruiting...");
        System.out.println("Check your Age");
        int age = 20;
        try {
            AgeUtils.checkAge(age);
            System.out.println("You pass !");
        } catch (AgeException e) {
            System.out.println("Your age invalid, you not pass");
            System.out.println(e.getMessage());
        }
    }
}
