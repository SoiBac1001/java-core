/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_person;

import vd_try_catch_demo.AgeUtils; // tên package.class

/**
 *
 * @author os_baonv
 */
public class ValidateUtils {
    public static void checkPerson(Person person) throws ValidateException{
        try {
            AgeUtils.checkAge(person.getAge());
        } catch (Exception e) {
            throw new ValidateException(e);
        }
        // so sánh chuỗi equals(): có phân biệt chữ hoa, chữ thường
        if(person.getGender().equals(Person.FEMALE)){ // trong class Person ta khai báo biến FEMALE là static final => có thể dùng class. đến biến trong hàm main() cũng là static
            GenderException e = new GenderException("Do not accept women");
            throw new ValidateException(e);
        }
    }
}
