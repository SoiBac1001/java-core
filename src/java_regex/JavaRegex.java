/*
 * @Author SoiBac1001
 * @Date Jan 31, 2019
 * @Version 1.0
 *
 * (C) Copyright 2019 SoiBac1001. All Rights Reserved.
 */
package java_regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Nguồn: http://viettuts.vn/java/su-dung-regex-trong-java
 */

public class JavaRegex {
    public static void main(String[] args) {
        testRegex();
        testRegex2();
        testRegex3();
        System.out.println("\n====================================");

        /*
         * \d{1,2}[-|/]\d{1,2}[-|/]\d{4}
         * \d{1,2}: nghĩa là một số có 1 hoặc 2 chữ số (ngày và tháng).
         * [-|/]: nghĩa là ký tự – hoặc /.
         * \d{4}: nghĩa là một số có 4 chữ số (năm).
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

    private static void testRegex() {
        System.out.println("\n====================================");
        System.out.println("testRegex1\n");
        // Get the regex to be checked
        String regex = "(G*s)";

        // Create a pattern from regex
        Pattern pattern = Pattern.compile(regex);

        // Get the String to be matched
        String stringToBeMatched = "GeeksForGeeks";

        // Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);

        // Get the current matcher state
        MatchResult result = matcher.toMatchResult();
        System.out.println("Current Matcher: " + result);

        while (matcher.find()) {
            // Get the group matched using group() method
//            System.out.println(matcher.group());
            System.out.println("Start: " + matcher.start() + ", End: " + matcher.end() + ", Group: " + matcher.group() + ", GroupCount: " + matcher.groupCount());
        }
    }

    private static void testRegex2() {
        System.out.println("\n====================================");
        System.out.println("testRegex2\n");
        // Get the regex to be checked
//        String regex = "(G*s)";
        String regex = "(\\d+(?:,\\d+){4,}|\\d+(?:,\\d+){2},[^0-2])";

        // Create a pattern from regex
        Pattern pattern = Pattern.compile(regex);

        // Get the String to be matched
//        String stringToBeMatched = "2,3,2,2,2";
        String stringToBeMatched = "2,3,2,3";
//        String stringToBeMatched = "GeeksForGeeks";

        // Create a matcher for the input String
        Matcher matcher = pattern.matcher(stringToBeMatched);

        // Get the current matcher state
        MatchResult result = matcher.toMatchResult();
        System.out.println("Current Matcher: " + result);

        while (matcher.find()) {
            // Get the group matched using group() method
//            System.out.println(matcher.group(1));
            System.out.println("Start: " + matcher.start() + ", End: " + matcher.end() + ", Group: " + matcher.group(0) + "\nGroupCount: " + matcher.groupCount());
        }

        // What is group(), group(1), ... in java ?
    }

    private static void testRegex3() {
        System.out.println("\n====================================");
        System.out.println("testRegex3\n");
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        while (m.find()) {
            System.out.println("Start: " + m.start() + ", End: " + m.end() + ", Group: " + m.group() + ", GroupCount: " + m.groupCount());
        }

        m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }
    }
}
