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
public class TryCatchDemo1 {
    public static void main(String[] args) {
        System.out.println("Start Recruiting...");
        System.out.println("Check your Age");
        int age = 10;
        try {
            AgeUtils.checkAge(age); // gọi được do 2 class TryCatchDemo1 và AgeUtils đang nằm trong cùng 1 package và hàm checkAge() là hàm static và hàm main() cũng là hàm static
            System.out.println("You pass !"); // từ tuổi, gọi vào hàm checkAge(age) để check tuổi
        } catch (TooYoungException e) {
            // do something
            System.out.println("You ate too young, not pass !");
            System.out.println(e.getMessage());
        } catch (TooOldException e){
            // do something
            System.out.println("You ate too old, not pass !");
            System.out.println(e.getMessage());
        }
    }
}
