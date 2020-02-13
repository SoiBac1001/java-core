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
public class Chuoi_String {
    public static void main(String[] args) {
        String a = null;
        String b = a;
        String test1 = "abc".intern();
        System.out.println("abc" == test1);
        final String q = "abcbcd";
        String searh = "abc" + "bcd";
        String qSearch = new StringBuilder("abc").append("bcd").toString();
        System.out.println(q == searh);

        /* Chuoi con */
        String str = "Hello World !";
        String subStr = str.substring(0); // gan subStr = str bat dau tu vi tri 0
        System.out.println("Do dai chuoi str = " + str.length());
        System.out.println("subStr = " + subStr);
        subStr = str.substring(6); // gan subStr = str bat dau tu vi tri 6 // World !
        System.out.println("subStr = " + subStr); // World !
        subStr = str.substring(1,4); // lay (4-1) = 3 ky tu, bat dau tu ky tu 1 (e) // ell // lấy được chuỗi con có 3 ký tự
        System.out.println("subStr = " + subStr);
        subStr = str.substring(6,11);
        System.out.println("subStr = " + subStr);
        
        /* Noi chuoi */
        String str1 = "Thank You !";
        String str2 = str + str1 + 8.5;
        System.out.println("Chuoi sau khi noi: " + str2);
        
        /* So sanh 2 chuoi co tuong duong ? */
        String str3 = "Thank You !";
        String str4 = "thank you !";
        System.out.println("2 chuoi tuong duong ? " + str3.equals(str4)); // co phan biet chu hoa, thuong
        System.out.println("2 chuoi tuong duong ? " + str3.equalsIgnoreCase(str4)); // khong phan biet chu hoa, thuong
        if(!str3.isEmpty())
            System.out.println("Chuoi str3 khong rong !");
        
        /* 1 so phuong thuc cua lop String */
        String str5 = "        thank you !                  ";
        System.out.println("Chuyen toan bo chuoi thanh chu hoa: " + str3.toUpperCase()); // Chuyen toan bo chuoi thanh chu hoa
        
        System.out.println("Chuyen toan bo chuoi thanh chu thuong: " + str3.toLowerCase()); // Chuyen toan bo chuoi thanh chu thuong
        
        System.out.println("Khi chua cat: " + str5);
        System.out.println("Sau khi cat cac khoang trang 2 ben: " + str5.trim()); // Xoa khoang trang o dau va cuoi cua chuoi
        
        System.out.println(str3.startsWith("Thank")); // kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không, nếu đúng trả về true, sai trả về false
        
        System.out.println("vi tri ky tu a trong chuoi str3: " + str3.indexOf('a')); // Phương thức indexOf() trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con. Nếu không tìm thấy trả lại giá trị -1. Chỉ số (index) được đếm từ 0.
        System.out.println("vi tri ky tu b trong chuoi str3: " + str3.indexOf('b'));
        System.out.println("vi tri ky tu a trong chuoi str3: " + str3.indexOf('a', 0));
        System.out.println("vi tri chuoi con trong chuoi str3: " + str3.indexOf("You"));
        
        System.out.println("Thay the chuoi: " + str3.replace("Thank", "How are you ?")); // How are you ? You !
        System.out.println("Thay the chuoi: " + str3.replace("Thank", "") + "\n"); //  You !
        
        /* Cắt chuỗi split() */
        String s1="Vi du ve viec tach tu";
        String[] st1=s1.split("\\s+");
        for(String w1:st1){
            System.out.println(w1);
        }
        
        String s2="Ban la ai? ban co xinh khong? chac xinh! dung xinh.";
        String[] st2=s2.split("[ \\. \\?\\!]");
        for(String w2:st2){
            System.out.println(w2);
        }
        System.out.println("");
        
        /* Chuyển đổi từ String sang các kiểu dữ liệu nguyên thủy */
        String s3 = "123";
        int i = Integer.parseInt(s3); // chuyển sang int // i = 123     
        long x = Long.parseLong("456");
        System.out.println(x);
        System.out.println(i);
        i++;
        
        /* Chuyển đổi từ số sang kiểu chuỗi */
        String s4 = Integer.toString(i); // s4 = "124";
        s3 = String.valueOf(i); // s3 = "124"
        System.out.println(s4);
        s4 = Long.toString(x);
        System.out.println(s4); // s4 = "456"
        System.out.println(s3);
    }
}
