/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 13a0_pr0_96
 */
public class DateAndTime {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println("The time of date is: " + date);
        String s = date.toString(); // chuyển định dang date sang String
        System.out.println("The time of date after convert: " + s);        
        long t = date.getTime(); // thời gian đổi ra mini giây (tích tắc) tính từ 1-1-1970
        System.out.println("Thoi gian doi ra mini giay tinh tu 1-1-1970: " + t + " mini giay (tich tac)");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTest = simpleDateFormat.parse("1995-01-15");
        long i = dateTest.getTime(); // 1 second = 1000 milliseconds
        long dif = t - i; // Nguồn: https://www.facebook.com/groups/laptrinh.IT/permalink/2265475570137722/
//        long temp = 60*60*24*365*1000; // Java mấy toán tử sẽ ưu tiên kiểu dữ liệu có số byte lớn hơn để return. Trong trường hợp này vế phải hoàn toàn là int nhưng kết quả lại lớn hơn max int. Cách sửa đơn giản nhất là thêm chữ L vào sau bất kỳ số nào của vế phải.
        long temp = 60*60*24*365*1000L; // int*int thì kết quả cũng là int // int*long thì kết quả trả về là long // Kết thúc bởi ký tự “L” thể hiện kiểu dữ liệu long
        long age = dif/(temp);
        System.out.println("Age = " + age); // 24 // vì hiện tại là ngày 2019-01-10 // mà ô kia sinh ngày 1995-01-07 => đã đủ 24 tuổi
        System.out.println("=================");
        
        Date date2 = new Date(t);
        date2.setTime(t);
        System.out.println("\nThe time of date2 is: " + date2);
        System.out.println("=================");
        
        SimpleDateFormat sdf = new SimpleDateFormat("E dd/MM/yyyy HH:mm:ss a");
        // E: Ngày trong tuần (Tuesday)
        // d: Ngày trong tháng (10)         // M: Tháng trong năm (July or 07)      // y: Năm trong dạng 4 chữ số (2001)
        // H: Giờ trong ngày (0~23) (22)    // m: Phút trong giờ (30)               // s: Giây trong phút (55)
        // a: A.M./P.M (PM)
        System.out.println("The time of date if format: " + sdf.format(date));// Định dạng date
        System.out.printf("The time after using printf format: %tc\n", date);
        
        // so sánh
        date2.setTime(t + 10000); // cộng thêm 10s
        long t2 = date2.getTime();
        if(t2 > t)
            System.out.println("\ndate2 later than date");
        else
            System.out.println("\ndate later than date2");
        
        System.out.println("\ndate2 compareto date: " + date2.compareTo(date)); // 1: date2 sau date
        
        System.out.println("\nIs date after date2 ? " + date.after(date2));
        System.out.println("Is date before date2 ? " + date.before(date2));
        System.out.println("Is date equals to date2 ? " + date.equals(date2));
    }
}
