/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_person;

/**
 *
 * @author os_baonv
 */
public class WrapperExceptionDemo {
    public static void main(String[] args) {
        Person person = new Person("Marry", Person.FEMALE, 20);
        try {
            ValidateUtils.checkPerson(person);
        } catch (ValidateException wrap) {
            Exception cause = (Exception) wrap.getCause();
            if(cause != null){
                System.out.println("Not pass, casue: " + cause.getMessage());
            } else
                System.out.println(wrap.getMessage()); // class System. đến đối tượng out (có kiểu là PrintStream - lớp PrintStream) (thiết lập final static out trong class System) => . được trực tiếp từ class
                // đối tượng out. tiếp đến hàm println trong class PrintStream
        }
    }
}
