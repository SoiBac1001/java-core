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
public class AgeUtils {
    public static void checkAge(int age) throws TooYoungException, TooOldException{
        if(age < 18) // tuổi < 18 thì quăng cho TooYoungException
            throw new TooYoungException("Age " + age + " too young"); // thông điệp được truyền vào (hàm tạo có tham số)
        else if(age > 40) // tuổi > 40 thì quăng cho TooOldException
            throw new TooOldException("Age " + age + " too old");
        else
            System.out.println("Age " + age + " ok !");
    }
}
