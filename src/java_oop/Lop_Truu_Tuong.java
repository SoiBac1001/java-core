/**
 * Lớp trừu tượng có thể không chứa phương thức trừu tượng nào cả.
 */
package java_oop;

/**
 *
 * @author os_baonv
 */
public class Lop_Truu_Tuong {
    
}

abstract class Number{
    public abstract int getValue(); // phương thức trừu tượng chỉ đc khai báo mà không được định nghĩa cụ thể
    public void test(){} // lớp trừu tượng có thể chứa phương thức không phải trừu tượng
    public abstract void changeValue();
}

class SoChan extends Number{
    int num = 100;

    @Override
    public void changeValue() {
        num +=2 ;
    }

    @Override
    public int getValue() {
       return 2;
    }
    
    
}