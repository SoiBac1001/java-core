/**
 * Trong TH
 */
package vd_try_catch_demo;

/**
 *
 * @author os_baonv
 */
public class AgeException extends Exception{
//    public AgeException(){}
    public AgeException(String message){ // lớp cha hàm tạo có tham số => lớp con hàm tạo super() cũng phải có tham số
        super(message); // gọi trực tiếp Constructor của lớp cha
    }
}
