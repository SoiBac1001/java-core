/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core.io;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author 13a0_pr0_96
 */
public class Doc_Ghi_File_Text_2 {
    public static void main(String[] args) {
        System.out.println(ChronoUnit.DAYS.between(LocalDate.parse("2021-04-09"), LocalDate.now()));
        System.out.println(isKep("33"));
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
}
