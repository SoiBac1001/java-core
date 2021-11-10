/**
 * Khi override một phương thức của lớp cha, phương thức ở lớp con không được phép tung ra các ngoại lệ mới
 * Phương thức ghi đè trong lớp con chỉ được phép tung ra các ngoại lệ giống hoặc là lớp con hoặc là tập con của các ngoại lệ được tung ra ở lớp cha.
 */
package java_core;

import OCA.Test_1;

import java.io.EOFException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws_7 {
    public static void myMethod(int tuoi, String ten) throws ArithmeticException, NullPointerException{
        if(tuoi < 18){
            throw new ArithmeticException("Chua du tuoi");
        }
        else if(ten == null){
            throw new NullPointerException("Thieu ten");
        }
    }
    
//    void readFile() throws EOFException{
//        
//    }
    
    void readFile() throws IOException{
        
    }
    
    public static void main(String[] args) {
        try {
            Map<Character, Integer> prefixOffsetMap = new HashMap<>();
            prefixOffsetMap.put('A', 1);
            for(char prefix = 'A'; prefix < 'J'; prefix++){
                String prefixValue = String.valueOf(prefix);
//                System.out.println(prefix);
                System.out.println(prefixValue);
                Integer integerValue = prefixOffsetMap.get(prefix);
                System.out.println(integerValue);
            }
            Test_1 test_1 = new Test_1();
            Class<? extends Test_1> test1Class = test_1.getClass();
            System.out.println(test1Class.getName());

            Map<LocalDate, String> testMap = new HashMap<>();
            LocalDate date1 = LocalDate.parse("2021-01-01");
            LocalDate date2 = LocalDate.parse("2021-01-01");
            testMap.put(date1, "abc");
            testMap.put(date2, "xyz");

            System.out.println(testMap.get(date1));
            // Obtains the current date-time from the system clock in the default time-zone.
            TemporalAccessor temporalAccessor = ZonedDateTime.now();
            System.out.println("ZonedDateTime: " + temporalAccessor);

            ZoneId zoneId = ZoneId.from(temporalAccessor);
            System.out.println("zoneId: " + zoneId);

            int matrix[][] = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            outer: for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (col == row) {
                        continue outer;
                    }
                    System.out.println(matrix[row][col]); // Prints the elements under the diagonal, i.e. 4, 7 and 8
                }
            }

            testRegex();
            testRegex2();
            myMethod(9,"");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

    }

    private static void testRegex(){
//        Pattern pattern = Pattern.compile("\\d{2,3}+");
        Pattern pattern = Pattern.compile("(.*)");
        Matcher matcher = pattern.matcher("2018 201 23 2 3 69");
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile(".*");
        matcher = pattern.matcher("2018 201 23 2 3 69");
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile("a+");
        matcher = pattern.matcher("aaaaa");
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile(".*?foo");
        matcher = pattern.matcher("xfooxxxxxxfoo");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void testRegex2() {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT34567a OK?";
        String pattern = "(.*)(\\d+)(.*)";
//        String pattern = "(\\d+)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        /*if (m.find( )) {
            System.out.println("Found value: " + m.group(0) + ", start: " + m.start(0) + ", end: " + m.end(0));
            System.out.println("Found value: " + m.group(1) + ", start: " + m.start(1) + ", end: " + m.end(1));
            System.out.println("Found value: " + m.group(2) + ", start: " + m.start(2) + ", end: " + m.end(2));
        }else {
            System.out.println("NO MATCH");
        }*/

        while(m.find( )) {
            System.out.println("Found value: " + m.group() + ", start: " + m.start() + ", end: " + m.end());
        }
    }

    public static void testRegex3() {
        String myStr = "1ello";
        System.out.println(Character.isDigit(myStr.charAt(0)));
        System.out.println(myStr.matches("^\\d.*$"));
        System.out.println(myStr.matches("^[0-9].*$"));
        System.out.println(myStr.startsWith("llo"));
        System.out.println(myStr.startsWith("o"));
    }
}

class test2 extends Exception_Throw_Throws_7{
//    @Override
//    void readFile() throws IOException{ // k được do ngoại lệ của lớp con > ngoại lệ của lớp cha
//        
//    }
    
    @Override
    void readFile() throws EOFException{ // ok
        
    }
}
