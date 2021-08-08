/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author 13a0_pr0_96
 */
public class Doc_Ghi_File_Text_2 {
    public static void main(String[] args) {
        Doc_File doc_file1 = new Doc_File();
        Doc_File doc_file2 = new Doc_File();
        System.out.println(doc_file1.equals(doc_file2));

        List<String> soList = buildRemainedSoList();
        System.out.println(soList);
        System.out.println(sumCapitalAmount());
        LocalDate startDate = LocalDate.parse("2021-04-15");
        LocalDate endDate = LocalDate.parse("2021-05-15");
        System.out.println(ChronoUnit.MONTHS.between(startDate, endDate));
        System.out.println(new BigDecimal(139979.6).divide(BigDecimal.valueOf(ChronoUnit.MONTHS.between(startDate, endDate)),
                2, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(139979.6).divide(BigDecimal.valueOf(ChronoUnit.MONTHS.between(startDate, endDate)), RoundingMode.HALF_UP));
        int rowNum1 = 3;
        int rowNum2 = 3;
        System.out.println(twoLargest(new int[]{1, 6, 7, 2, 3}, rowNum1++));
        System.out.println(twoLargest(new int[]{1, 6, 7, 2, 3}, ++rowNum2));
        printTwoMaxNumberWithoutSortMethod(new int[]{1, 6, 8, 6, 7});
        System.out.println(BigDecimal.valueOf(-6000).subtract(BigDecimal.TEN));
        System.out.println(isKep("33"));
        System.out.println(isKep("34"));

        Integer viTri1 = 30000;
        Integer viTri2 = 30000;
        calculate(viTri1, viTri2);
        BigDecimal totalAllCapitalAmount = BigDecimal.ZERO;
        test(totalAllCapitalAmount);
        Integer iTest = 300;
        Integer jTest = 300;
        System.out.println(iTest == 300);
        System.out.println(iTest.compareTo(300) > -1);
        int number = 3;
        float number2 = 4;
        float remainder = 140 % number;
        System.out.println(remainder == 0 ? 140/number : (140/number + 1));
        System.out.println(Math.round(140/number));
        System.out.println(Math.round(141/number2));
//        requireNotNullObjects(null, null);
        System.out.println(ChronoUnit.DAYS.between(LocalDate.parse("2021-04-13"), LocalDate.parse("2021-04-16")));

        BigDecimal capitalAmount = BigDecimal.ONE;
        System.out.println(capitalAmount.multiply(BigDecimal.TEN));
        System.out.println(capitalAmount);
        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedString = localDate.format(formatter);
        System.out.println(formattedString);

        countSo("04", "339730611842871204864020415775", 5);
        System.out.println(getChuSo(1));
        lable();
        File file = new File("output.txt");
        String a = "494004905348238874162166218889";
        String g3 = "";
        for(int i = 0; i<a.length(); i+=5){
            if(i > 0){
                g3 += " ";
            }
            g3 += a.substring(i, i+5);
        }

        String giai = getGiai(a, 5);
        System.out.println(giai);;
        String substring = a.substring(0, 5)+ " " + a.substring(5);
        System.out.println(substring);
        File file2 = new File("E:\\Project\\work\\Fresher Java\\Java Core + Thread\\Java_Core\\MM.txt");
        try (Scanner sc = new Scanner(file2)){
            String str;
            while(sc.hasNext()){ // KT trong file còn dòng tiếp theo hay k ?
                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                str = sc.nextLine();
                LocalDate date = simpleDateFormat.parse(str).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                System.out.println(date);
                System.out.println(LocalDate.parse("17/03/2021", formatter1));
            }
        } catch (Exception e) {
        }


/*
        File file = new File("demo.txt");
        try (Scanner sc = new Scanner(file)){
            int i;
            while(sc.hasNext()){ // KT trong file còn dòng tiếp theo hay k ?
                i = sc.nextInt();
                System.out.println(i);
            }
        } catch (Exception e) {
        }
*/
    }

    public static int[] twoLargest(int values[], int rowNum){
        System.out.println(rowNum);
        int largestA = Integer.MIN_VALUE, largestB = Integer.MIN_VALUE;

        for(int value : values) {
            if(value > largestA) {
                largestB = largestA;
                largestA = value;
            } else if (largestB < value  && value < largestA) {
                largestB = value;
            }
        }
        return new int[] { largestA, largestB };
    }

    private static void printTwoMaxNumberWithoutSortMethod(int[] input) {
        int max=0,lastMax=0;
        lastMax=input[0];
        max=input[0];
        for(int i=1;i<input.length;i++)
        {
            if(lastMax<input[i] & max<input[i])
            {
                lastMax=max;
                max=input[i];

            }
        }
        System.out.println("lastMax="+lastMax+" : max="+max);

    }

    private static void requireNotNullObjects(Object...objects){
        for(Object object : objects){
            if(object == null){
                throw new IllegalArgumentException("All param must not be null");
            }
        }
    }

    public static boolean isKep(String so){
        return so.charAt(0) == so.charAt(so.length() - 1);
    }

    private static char getChuSo(Integer viTri){
        char chuSo = 0;
        String giaiThuong = "12345";
        if(0 <= viTri && viTri <= 4){
            chuSo = giaiThuong.charAt(viTri);
        }
        return chuSo;
    }

    private static int countSo(String checkedSo, String giai, int lengthOfNumber) {
        int count = 0;
        for (int i = 0; i < giai.length(); i += lengthOfNumber) {

            String so = giai.substring(i + lengthOfNumber - 2, i + lengthOfNumber);
            if(checkedSo.equals(so)){
                count++;
            }
        }
        return count;
    }

    private static void lable(){
        int[] numbers= new int[]{100,18,21,30};

        //Outer loop checks if number is multiple of 2
        OUTER:  //outer label
        for(int i = 0; i<numbers.length; i++){
            if(i % 2 == 0){
                System.out.println("Odd number: " + i + ", continue from OUTER label");
                continue OUTER;
            }

            INNER:
            for(int j = 0; j<numbers.length; j++){
                System.out.println("Even number: " + i + ", break  from INNER label");
                break INNER;
            }
        }
    }

    private static String getGiai2(String text, int length){
        String giai = "";
        for(int i = 0; i<text.length(); i+=length){
            if(i > 0){
                giai += " ";
            }
            giai += text.substring(i, i+length);
        }
        return giai;
    }

    private static String getGiai(String text, int lengthOfNumber) {
        StringBuilder giai = new StringBuilder();
        for (int i = 0; i < text.length(); i += lengthOfNumber) {
            if (i > 0) {
                giai.append(" ");
            }
            giai.append(text, i, i + lengthOfNumber);
        }
        return giai.toString();
    }

    private static void test(BigDecimal totalAllCapitalAmount){
//        String str = "➤ Total profit amount -16892.0k on 01-05-2021";
        String str = "➤ Total profit amount 16892.0k on 01-05-2021";

//        Pattern pattern2 = Pattern.compile("-?[0-9]+");
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int value = Integer.parseInt(matcher.group());
            System.out.println(value);
        }

        String strDate = "Chủ nhật ngày 16-05-2021";
        pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
        matcher = pattern.matcher(strDate);
        if (matcher.find()) {
            String date = matcher.group();
            System.out.println(date);
        }

        totalAllCapitalAmount = totalAllCapitalAmount.add(new BigDecimal(10));
        Map<Integer, List<String>> diemAndSoMap = new HashMap<>();
        List<String> soList = Arrays.asList("10", "50", "70", "12");
        int diem = 140;
        int numberOfAccounts = 3;
        int remainder = diem % numberOfAccounts;
        int avgDiem = diem / numberOfAccounts;
//					splitDiem = remainder == 0 ? splitDiem : (splitDiem + 1);
//                    int splitDiem = Math.round(diem / numberOfAccounts);
        for (int i = 0; i < numberOfAccounts; i++){
            if (remainder + i == numberOfAccounts){
                avgDiem++;
            }

            putValueSameKeyToMap(diemAndSoMap, avgDiem, soList);
        }
    }

    private static void calculate(int viTri1, int viTri2){
        if(viTri1 == 30000){
            System.out.println(viTri1 + ", " + viTri2);
        }
    }

    private static <T, X> void putValueSameKeyToMap(Map<T, List<X>> map, T key, List<X> values){
//        CommonUtils.requireNonNullObjects(values);
        if (map.containsKey(key)) {
            map.get(key).addAll(values);
        } else {
            List<X> newValues = new ArrayList<>(values);
            map.put(key, newValues);
        }
    }

    private static long sumCapitalAmount(){
        List<Integer> numbers = Arrays.asList(374247,5589,5157,5103,2646,2646,2646,2646,2619,2511,972,972,972,972,972,972,945,918,432,432,432,432,432,405,378,378,297,162,162,162,162,162,162,162,162,162,162,162,162,162,162,162,162,162,162,162,135,135,135,135,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,54,27,27,27,27);
        long total = 0;
        for(Integer i : numbers){
            total += i;
        }

        return total - 306423;
    }

    private static List<String> buildRemainedSoList(){
        List<String> remainedSoList = new ArrayList<>();
        Set<String> allLastTwoDigits = Stream.of(13, 15, 20, 22, 23, 25, 28, 31, 31, 39, 39, 42, 42, 46, 46, 52, 55, 61, 62, 66, 68, 71, 75, 82, 84, 98, 99)
                .map(String::valueOf).collect(Collectors.toSet());

        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                String so = i + "" + j;
                if(!allLastTwoDigits.contains(so)){
                    remainedSoList.add(so);
                }
            }
        }

        Collections.shuffle(remainedSoList);

        return remainedSoList;
    }
}
