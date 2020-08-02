/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Nguồn: http://viettuts.vn/java-date/simpledateformat-trong-java
 * @author SoiBac1001
 */
public class Java_SimpleDateFormat {
    public static void main(String[] args) {
    	
        // chuyển đổi date thành string
        Date date = new Date();
        System.out.println("Date hien tai: " + date);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // M (chữ hoa) biển diễn tháng, còn m (m thường) biểu diễn phút
        String strDate = formatter.format(date); // chuyển đổi date thành string và hiển thị ngày theo định dạng formatter ở trên
        System.out.println("Date format with dd-MM-yyy: " + strDate);
        formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date format with dd-MM-yyyy hh:mm:ss: " + strDate);
        
        // chuyển đổi string thành date
//        formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            
//            date = formatter.parse("01/10/2017 12:10:20"); // chuyển đổi string thành date // phải khớp với formatter ở trên
        	date = formatter.parse("01/11/2017");
        } catch (ParseException ex) {
            Logger.getLogger(Java_SimpleDateFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Date: " + date);
    }
}
