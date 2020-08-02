/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.oop.java_interface_va_abstract;

/**
 *
 * @author os_baonv
 */
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat(5, "tam the");
        Bird b = new Bird(7, "nhat");
        Style s;
        Hanh_Dong hd;
        System.out.println(c.getName() + ", " + c.getAge() + " tuoi," + " thich an " + c.food() + ", uong " + c.drink() + ", co so thich: " + c.hobby());
        
        s = c;
        System.out.println(c.getName() + ", " + c.getAge() + " tuoi," + " thich an " + s.food() + ", uong " + s.drink() + ", co so thich: " + s.hobby());
        hd = c;
        System.out.println("an " + hd.food());
    }
}
