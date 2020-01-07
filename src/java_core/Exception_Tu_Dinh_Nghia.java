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


public class Exception_Tu_Dinh_Nghia {
    public static void executeHasException() throws TestException{
        throw new TestException();
    }
}

class TestException extends Exception{ // MyException bị trùng với tên với class khác
    // do something
}