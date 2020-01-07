/**
 * 1 class sử dụng interface với cú pháp implements tên_interface thì bắt buộc phải định nghĩa đầy đủ cho tất cả các phương thức có trong interface đó
 * Một lớp có thể implements nhiều interface
 */
package java_oop.java_interface_va_abstract;

/**
 *
 * @author SoiBac1001
 */
public class Cat implements Style, Hanh_Dong{
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String food() {
        return "fish";
    }

    @Override
    public String drink() {
        return "milk";
    }

    @Override
    public String hobby() {
        return "sleep";
    }

    @Override
    public String action() {
        return "bat chuot";
    }
    
}
