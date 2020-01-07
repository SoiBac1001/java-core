
package java_core.java_string;

/**
 *
 * @author 13a0_pr0_96
 */
public class CatChuoi_split {
/*  Link tham khảo:
    https://www.youtube.com/watch?v=iJ1nkjOz1D4
    http://vietjack.com/java/string_split_trong_java.jsp
    http://viettuts.vn/java-string/phuong-thuc-split
    https://www.tutorialspoint.com/java/java_string_split.htm
    https://www.tutorialspoint.com/java/java_string_split_regexlimit.htm
    
    Cú pháp:
        public String[] split(String regex, int limit)
        public String[] split(String regex)
        // regex: biểu thức chính quy
*/    
    public static void main(String[] args) {
        String s1="Vi du    ve viec    tach tu";
        String[] st1=s1.split("\\s+"); // dùng khi có 1 hoặc nhiều khoảng trắng // ký tự đặc biệt '\' phải dùng thêm \
        for(String w1:st1){
            System.out.println(w1);
        }
        System.out.println("");
//      ==================================================================
        String s3="Vi.du.ve.viec.tach.tu";
        String[] st3=s3.split("\\."); // ký tự đặc biệt '.' phải dùng '\.' và ký tự đặc biệt '\' phải dùng thêm \
        for(String w3:st3){
            System.out.println(w3);
        }
        System.out.println("");
//      ==================================================================  
        String s2="Ban la ai? ban co xinh khong? chac xinh! dung xinh.";
        String[] st2=s2.split("[ \\. \\?\\!]");
        for(String w2:st2){
            System.out.println(w2);
        }
        System.out.println("");
//      ==================================================================
        String Str2 = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value :" );      

        for (String retval: Str2.split("-")) {
           System.out.println(retval);
        }
        System.out.println("");
//      ==================================================================      
        String Str = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 2)) { // 2 chuỗi được trả về
           System.out.println(retval);
        }
        System.out.println("");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 3)) { // 3 chuỗi được trả về
           System.out.println(retval);
        }
        System.out.println("");
        System.out.println("Return Value :" );

        for (String retval: Str.split("-", 0)) { // giống for (String retval: Str2.split("-")) // cứ gặp dấu '-' thì trả về 1 chuỗi
           System.out.println(retval);
        }
        System.out.println("");
//      ==================================================================
    }
}
