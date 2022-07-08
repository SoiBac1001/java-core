/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.interface_java_core;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author os_baonv
 */
public interface ThirdInterface {
    default void print(String string) {
        if (!isNull(string))
            System.out.println("ThirdInterface Print::" + string);
    }

    default boolean isNull(String string) {
        System.out.println("Interface Null Check");

        return string == null ? true : "".equals(string) ? true : false;
    }

    /*static boolean isNull(String string) {
        System.out.println("Interface Null Check");

        return string == null ? true : "".equals(string) ? true : false;
    }*/
}
