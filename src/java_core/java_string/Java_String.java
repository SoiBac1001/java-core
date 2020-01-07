/**
 * Phương thức compareTo() so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển. Nó trả về số dương, số âm hoặc 0.
 * Nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai, nó sẽ trả về số dương (chênh lệch giá trị ký tự).
 * Nếu chuỗi đầu tiên nhỏ hơn chuỗi thứ hai, nó sẽ trả về số âm và nếu chuỗi đầu tiên là bằng chuỗi thứ hai, nó trả về 0.
 */
package java_core.java_string;

/**
 *
 * @author os_baonv
 */
public class Java_String {
	private static boolean test; // giá trị khởi tạo là "false"
    public static void main(String[] args) {
//        substring()
        String s = "Hello World";
        System.out.println(s.equalsIgnoreCase("Hel")); // false
        System.out.println(s.startsWith("Hello Wor")); // true // được sử dụng để kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không
        System.out.println(s.startsWith("e")); // false
        System.out.println(s.startsWith("H")); // true // tức chuỗi s KT phải bắt đầu bằng ký tự 'H'
        System.out.println(s.contains("e")); // true
        // tức là chuỗi KT luôn phải bắt đầu giống với chuỗi ban đầu, nếu ko nó sẽ trả về false như ở dưới
        System.out.println(s.startsWith("World")); // false
        System.out.println("==============");
        System.out.println(s.contains("lo World")); // true // contain thì cứ chứa đúng chuỗi đó là đc
//        for(int i=0; i<s.length(); i++) {
//        	System.out.println(s.charAt(i));
//        }
        System.out.println("==============");
        
        System.out.println(test);
        String s9 = "  hello string   ";
        System.out.println(s9 + "java"); 
        System.out.println(s9.trim()); // Phương thức trim() được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi

        System.out.println(s.length()); // 11 gồm cả khoảng trắng
        System.out.println(s.substring(6)); // lấy chuỗi bắt đầu từ vị trí 6 đến hết => World
        System.out.println(s.substring(0, 2)); // sẽ lấy số ký tự bắt đầu tự vị trí 0 đến vị trí 1 => He
        String s1 = "Hello aarld";
        System.out.println(s.compareToIgnoreCase(s1));
    }
}
