/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core;

/**
 *
 * @author os_baonv
 */
public class Exception_Throw_Throws_6 {
    public static int getEndMember(int[] a) throws ArrayIndexOutOfBoundsException{ // Nếu xảy ra ngoại lệ thì ném ngoại lệ đó vào exception ArrayIndexOutOfBoundsException
        return a[a.length - 1];
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int j;
        try { // bắt try...catch ở hàm main
            int i = getEndMember(a);
            if(i == 0)
                throw new ArithmeticException();
            else{
                System.out.println("else duoc thuc hien");
                j = 10/i;
            }                
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Khong dung vi tri phan tu");
        }
    }
}
