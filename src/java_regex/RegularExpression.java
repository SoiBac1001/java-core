/**
 * Nguồn: https://www.javatpoint.com/java-regex
 * https://www.tutorialspoint.com/java/java_regular_expressions.htm
 * https://www.tutorialspoint.com/java/java_string_matches.htm
 * https://vietjack.com/java/string_matches_trong_java.jsp
 */
package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 13a0_pr0_96
 */
public class RegularExpression {
    public static void main(String[] args) {
//      ==================================================================
        String s4 = "abas123fasdf5489"; // tách riêng số ra
        System.out.println(s4.replaceAll("\\D", "")); // \\D ký tự không phải là số
        System.out.println(s4.replaceAll("\\d", "")); // \\d ký tự số
        System.out.println(s4.replaceAll("[^a-zA-Z]", "")); // [^a-zA-Z]: không phải ký tự chữ // số // ^ ở trong []: phủ định
                                                           // String regex = "^[Bb]{1}\\d{2}\\w{4}\\d{3}$"; // ^ ở ngoài: bắt đầu...
                                                          // [^abc] Bất kỳ ký tự nào ngoại trừ a, b, hoặc c (phủ định)
                                                         // $ kiểm tra kết thúc dòng 
        System.out.println(s4.length()); // 16
        s4 = s4.replaceAll("[^a-zA-Z]", ""); // s4 = abasfasdf
        System.out.println(s4.length()); // 9
        System.out.println("=============");
        
//      ==================================================================
        /** KIỂU 1 **/
        String s5 = "115646";
        String regex = "[0-9]+"; // các số từ 0->9 và có thể lặp lại
        System.out.println(s5.matches(regex)); // true // check chuỗi s5 các ký tự có thuộc đoạn [0-9]+ không ? (các số có thể được lặp lại)
        s5 = "adiad";
//        regex = "[a-zA-Z]"; // check 1 ký tự => true
        regex = "[a-zA-Z]+"; // check 1 hoặc nhiều ký tự
        System.out.println(s5.matches(regex));
        
        /** KIỂU 2 **/
        System.out.println(Pattern.matches("[amn]+", "amnamn")); // true
        System.out.println(Pattern.matches("[amn]+", "zamnamn"));// false do có thêm ký tự 'z'
        System.out.println(Pattern.matches("[789]{1}\\d{9}+", "7456278146")); // true
        System.out.println(Pattern.matches("[789]{1}\\d{9}+", "1456278146")); // false
        System.out.println("=============");
        
//      ==================================================================

        /** KIỂU 3 **/
        //1st way  
        Pattern p = Pattern.compile(".s");//. represents single character // . ký tự bất kỳ // ký tự bất kỳ + s // chỉ có 1 ký tự s theo sau cuối cùng
//        Matcher m = p.matcher("@s");
        Matcher m = p.matcher("@ss"); // false
        boolean b = m.matches();  

        //2nd way  
        boolean b2=Pattern.compile(".s").matcher("as").matches();  
        
        /** KIỂU 2 **/
        //3rd way  
        boolean b3 = Pattern.matches(".s", "as");  

        System.out.println(b+" "+b2+" "+b3);  
    }
}
