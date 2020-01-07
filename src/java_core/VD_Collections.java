/**
 * Lớp Iterator trong java.util cung cấp các phương thức
 *  + hasNext(): có phần tử tiếp theo hay không
 *  + next(): lấy phần tử tiếp theo
 *  + remove(): loại bò phần tử cuối cùng
 */
package java_core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author SoiBac1001
 */
public class VD_Collections {
    public static void main(String[] args) {
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
}
