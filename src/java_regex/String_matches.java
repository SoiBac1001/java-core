/**
 * KT chuỗi có khớp với biểu thức chính quy (regular expression) đã cho hay k ?
 * public boolean matches(String regex): trả về true nếu chuỗi này so khớp với regular expression đã cung cấp
 * str.matches(regex) <=> Pattern.matches(regex, str)
 */
package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Nguồn: http://viettuts.vn/java/su-dung-regex-trong-java
 * @author SoiBac1001
 */
public class String_matches {
    public static void main(String[] args) {
        String str = new String("Hello   World");
        System.out.println(str.matches("(.*)el(.*)")); // true vì có 2 (.*) nên chỉ cần chuỗi ban đầu có chứa các ký tự của chuỗi regex
        System.out.println(str.matches("ell(.*)")); // false vì nếu để 1 (.*) thì phải đúng từ đó có trong chuỗi ban đầu và vị trí để (.*) về phía chuỗi ban đầu mà còn từ. VD như bên dưới
        System.out.println(str.matches("Hello(.*)")); // true vì có từ đó và phía sau Hello vẫn còn từ
        System.out.println(str.matches("(.*)Hello")); // false vì có từ đó nhưng phía trước Hello không còn từ
        System.out.println(str.matches("(.*)World")); // true
        System.out.println(str.matches("(.*)Wor")); // false
        System.out.println("======0=======");
        
        String s = new String ("Em777cua888ngay hom qua");
        // +: 1 hoặc nhiều lần, viết ngắn gọn cho {1,}
        // ?: 0 hoặc 1 lần, viết ngắn gọn cho {0,1}
        // *: 0 hoặc nhiều lần, viết ngắn gọn cho {0,}
        
        /*String[] test = s.split("\\s+"); // ký tự đặc biệt '\' phải dùng thêm \
        for(String element : test) {
        	System.out.println(element);
        }*/
        
        System.out.println(s.replaceAll("\\D", "")); // \D Ký tự không phải là số, viết tắt của [^0-9]
        System.out.println(s.replaceAll("[^0-9]", ""));
        System.out.println(s.replaceAll("\\d", ""));
        System.out.println(s.replaceAll("[^a-zA-Z]", "")); // Nếu sử dụng trong dấu […] thì nó có nghĩa là phủ định // TH này thay cả khoảng trắng = ""
        System.out.println("======1=======");
        
        String data = "6245245245";
        String regex = "[0-9]+"; // 0 tới 9
        System.out.println(data.matches(regex)); // true
        System.out.println(Pattern.matches("[abc]+", "abcccbba")); // true
        System.out.println(Pattern.matches("[F][W]\\d{5}", "FW01235")); // true
        System.out.println(Pattern.matches("F{1}[W]\\d{5}", "FW01235")); // true
        System.out.println(Pattern.matches("[C][A][G]|[L][G][R]", "LGR")); // true
        System.out.println("======2=======");
        
        System.out.println(Pattern.matches("^Excellence|Good|Fair|Poor$", "good")); // false
        System.out.println(Pattern.matches("^[1-9]{4}$", "9234")); // true
        System.out.println(Pattern.matches("^[a-zA-Z]{1,40}$", "abc")); // true
        System.out.println(Pattern.matches("^[789]{1}\\d{7}", "88123698")); // true
        System.out.println("======3=======");
        
//        Pattern pattern = Pattern.compile("[0-9]+");
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(data);
//        System.out.println(matcher.matches()); // true
        if(matcher.matches()) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
        
        if(matcher.matches() && data.length() > 6) {
        	System.out.println("true");
        }else {
        	System.out.println("false");
        }
    }
}
