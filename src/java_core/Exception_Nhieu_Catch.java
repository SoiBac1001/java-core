/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author os_baonv
 */
public class Exception_Nhieu_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "Done";
        try {
            int a[] = new int[5];
            System.out.println("Nhap vao 1 so: ");
            int divide = sc.nextInt();
            int result = a[4]/divide;
        }
/*        catch(ArrayIndexOutOfBoundsException e){ // ngoại lệ truy cập sai phần tử trong mảng
//            System.out.println(e.toString());
            message = e.toString();
        } catch(ArithmeticException e) { // ngoại lệ chia số cho 0
            message = e.toString();
        } catch(InputMismatchException e){
            message = e.toString();
        }
*/
        catch(Exception e){
            /**
             * Write log
             * Show dialog
             * Print cmd
             */
            message = e.toString();
        }
        System.out.println("Message: " + message);

        try {
            String s="abc"; // chuỗi ký tự
            int i=Integer.parseInt(s); // chuyển đổi chuỗi ký tự sang dạng số sẽ xảy ra NumberFormatException
        } catch (NumberFormatException e) { // ngoại lệ định dạng sai giá trị
            System.out.println(e.toString());
        }
        
        try {
            System.out.println("Before");
            String test ="StudyAndShare";
            System.out.println(test.substring(50)); // Lấy chuỗi con bắt đầu từ phẩn tử thứ [50] trong chuỗi
            System.out.println("gigi"); // Có exception ở dòng trên thì nó nhảy vào catch luôn chứ k thực hiện các dòng code sau nữa
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " +e.toString());
        }finally{
            System.out.println("always done");
        }
        
        System.out.println("After");
    }
}
