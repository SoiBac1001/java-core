/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_io;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author 13a0_pr0_96
 */
public class Doc_Ghi_File_Text_2 {
    public static void main(String[] args) {

        File file = new File("output.txt");
        try (Scanner sc = new Scanner(file)){
            String str;
            while(sc.hasNext()){ // KT trong file còn dòng tiếp theo hay k ?
                str = sc.nextLine();
                System.out.println(str);
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
}
