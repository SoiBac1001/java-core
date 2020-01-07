/*
 * @Author Baonv11
 * @Date Jan 31, 2019
 * @Version 1.0
 * 
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Nguồn: http://viettuts.vn/java/su-dung-regex-trong-java
 */
public class Java_Regex {
	public static void main(String[] args) {
		/*
		 * \d{1,2}[-|/]\d{1,2}[-|/]\d{4}
		 * \d{1,2}: nghĩa là một số có 1 hoặc 2 chữ số (ngày và tháng).
		 * [-|/]: nghĩa là ký tự – hoặc /.
		 * \d{4}: nghãi là một số có 4 chữ số (năm).
		 */
		double d = Math.pow(10, 6) - 1;
		System.out.println(1000000 > d);
		String text1 = "Hello java regex 2-12-2018, hello world 12/12/2010";
		String text2 = "2-1-1999";
//		Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}"); // biên dịch regex đã cho và trả về thể hiện của Pattern.
		Pattern pattern = Pattern.compile("\\d{1,2}[/]\\d{1,2}[/]\\d{4}"); // biên dịch regex đã cho và trả về thể hiện của Pattern.
		Matcher matcher = pattern.matcher(text1); // kiểm tra xem biểu thức chính quy có khớp với mẫu hay không.
		
		System.out.println("Ngay thang trong chuoi text1: " + text1);
		while(matcher.find()) { // tìm biểu thức tiếp theo khớp với mẫu.
			System.out.println(text1.substring(matcher.start(), matcher.end()));
		}
		/*
		 * int start(): trả về vị trí bắt đầu của chuỗi con phù hợp.
		 * int end(): trả về vị trí kết thúc của chuỗi con phù hợp.
		 */
		
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "d")); // true
	}
}
