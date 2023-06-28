
package java_core.string;

public class StringBuilderClass {
    private static String text;
    public static void main(String[] args) {
        String input = "a";
        setString(input);
        input = "b";

        System.out.println(text);
        System.out.println(input);
        StringBuilder sb = new StringBuilder("Hello world !"); // Tạo một Builder với chuỗi đã xác định
        
//        System.out.println("Thong tin trong sb la: " + sb.toString()); // Hello world !
        System.out.println("Thong tin trong sb la: " + sb); // Hello world !
        
        System.out.println("Size of sb: " + sb.length()); // 13
        
        System.out.println("Sau khi them vao cuoi sb: " + sb.append(" Thanks !")); // nối thêm tham số vào cuối chuỗi // Hello world ! Thanks !
        
        System.out.println("Sau khi chen: " + sb.insert(6, "Bao ")); // chèn bắt đầu từ vị trí thứ 6 (ngay sau vị trí thứ 5) // Hello Bao world ! Thanks !
        
        System.out.println("Sau khi chinh sua: " + sb.replace(0, 5, "Hi")); // thay thế chuỗi từ ký tự 0 đến ký tự (5-1) = 4 // Hi Bao world ! Thanks !
        
        System.out.println("Sau khi dao nguoc chuoi: " + sb.reverse()); // ! sknahT ! dlrow oaB iH
        System.out.println("Chuoi sb: " + sb); // ! sknahT ! dlrow oaB iH
        
        System.out.println("Sau khi xoa 1 doan chuoi: " + sb.delete(0, 7)); // xóa đoạn chuỗi từ ký tự 0 ký tự đến(7-1) = 6 // T ! dlrow oaB iH
    }

    private static void setString(String input) {
        text = input;
    }
}
