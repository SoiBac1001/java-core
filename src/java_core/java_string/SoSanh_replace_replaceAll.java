/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.java_string;

/**
 *
 * @author 13a0_pr0_96
 */
public class SoSanh_replace_replaceAll {
    public static void main(String[] args) {
        String klt = "tenhlaptrinh.net";
        System.out.println("so sánh đầu :");
        System.out.println("replace = "+klt.replace("^t", "k")); // thay thế ký tự đầu (^) nhưng do là replace() nên chuỗi k thay đổi: tenhlaptrinh.net
//        System.out.println("replace = "+klt.replace("t", "k")); // kenhlapkrinh.nek
        System.out.println("replaceAll = "+klt.replaceAll("^t", "k")); // thay thế ký tự đầu: kenhlaptrinh.net
        System.out.println("\nso sánh cuối :");
        System.out.println("replace = "+klt.replace("t$", "k")); // thay thế ký tự cuối ($) nhưng do là replace() nên chuỗi k thay đổi: tenhlaptrinh.net
        System.out.println("replaceAll = "+klt.replaceAll("t$", "k")); // thay thế ký tự cuối: tenhlaptrinh.nek
    }
}
