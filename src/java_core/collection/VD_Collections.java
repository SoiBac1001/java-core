/**
 * Lớp Iterator trong java.util cung cấp các phương thức
 *  + hasNext(): có phần tử tiếp theo hay không
 *  + next(): lấy phần tử tiếp theo
 *  + remove(): loại bò phần tử cuối cùng
 */
package java_core.collection;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *
 * @author SoiBac1001
 */
public class VD_Collections {
    public static void main(String[] args) {
        String source = "source";
        String encodeBase64 = encodeBase64(source.getBytes());
        String decodeBase64 = decodeBase64(source.getBytes());
        String decode = decodeBase64(encodeBase64);

        Collection name = new ArrayList();
        name.add("Nui Truc");
        name.add("Giang Van Minh");
        Iterator i = name.iterator();
        String s;
        while(i.hasNext()){ // hasNext(): có phần tử tiếp theo hay không
            s = (String) i.next(); // next(): lấy phần tử tiếp theo và gán cho chuỗi s
            System.out.println(s); // hiển thị ra chuỗi s
        }
        
        ArrayList list = new ArrayList();
        int a = 0;
        for(int k=0; k<3; k++){
            a = k;
            list.add(a);
            list.add("hihi"); // sau khi add chuỗi "hihi" thì mảng ArrayList list chứa cả dữ liệu kiểu int và String
        }
        
        for(Object k : list){
            System.out.println(k + ", ");
        }
    }

    private void test(){
        encodeBase64("source".getBytes());
    }

    private static String encodeBase64(byte[] source){
        return Base64.getEncoder().encodeToString(source);
    }

    private static String decodeBase64(byte[] source){
        return Arrays.toString(Base64.getDecoder().decode(source));
    }

    private static String decodeBase64(String source){
//        return new String(Base64.getDecoder().decode(source), StandardCharsets.UTF_8);
        return new String(Base64.getDecoder().decode(source));
    }
}
