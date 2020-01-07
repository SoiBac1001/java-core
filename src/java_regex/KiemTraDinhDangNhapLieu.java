/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 13a0_pr0_96
 */
public class KiemTraDinhDangNhapLieu {
    
    static void isID(String s){
            /** KIỂU 3 **/
            Pattern p = Pattern.compile("^[Bb]{1}[0-9]{2}[a-zA-Z]{4}[0-9]{3}$"); // chuỗi kiểm tra (mẫu) // $ đóng chuỗi // KT kết thúc dòng
//            Pattern p = Pattern.compile("^[Bb]{1}\\d{2}[a-zA-Z]{4}\\d{3}$"); // chuỗi kiểm tra
//            Pattern p = Pattern.compile("^[Bb]{1}\\d{2}\\w{4}\\d{3}$"); // chuỗi kiểm tra // ký tự đặc biệt phải thêm dấu \
            Matcher m = p.matcher(s);
//            if(m.matches())
//                System.out.println("Accept");
//            else
//                System.out.println("Failed");

            if(m.find())
                System.out.println("Accept");
            else
                System.out.println("Failed");
    }
    public static void main(String[] args) {
        String s1 = "b14dccn256";
        String s2 = "abnkfl3564";
        String s3 = "b16dc5n647";
        
        isID(s1);
        isID(s2);
        isID(s3);
    }
}
