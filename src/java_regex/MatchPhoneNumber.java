/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_regex;

/**
 *
 * @author 13a0_pr0_96
 */
public class MatchPhoneNumber {
    public static boolean isPhoneValid(String phone){
        boolean retval = false;
        String regex = "^\\(?\\d{3} \\)?-?\\s*\\d{3} \\s*-?\\d{4}$";
        retval = phone.matches(regex);
        if (retval)
            System.out.println("MATCH "+phone + "\n");
        return retval;
    }
    
    static boolean isID(String id){
        /** KIỂU 1 **/
        boolean retal = false;
        String regex = "^[Bb]{1}\\d{2}\\w{4}\\d{3}$";
        retal = id.matches(regex);
        if(retal)
            System.out.println("MATCH " + id);       
        return retal;
    }
    public static void main(String args[]) {
        System.out.println(isPhoneValid("(234) - 765 -8765"));
        System.out.println(isPhoneValid("999-585-4009"));
        System.out.println(isPhoneValid("1-585-4009"));
        System.out.println("");
        
        isID("B13DCCN765");
        isID("b14dccn256");
    }
}
