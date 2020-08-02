/**
 * Interface không thể khởi tạo
 * Interface hỗ trợ đa kế thừa
 * Phương thức mặc định là abstract mặc dù không khai báo từ khóa abstract
 * Các biến trong interface bắt buộc phải là : public hoặc static hoặc final
 * Interface dùng để chỉ ra công việc mà class thực thi nó sẽ làm nhưng không chỉ ra cách thức cụ thể sẽ làm nó như thế nào
 * Interface thê hiện Đối tượng đó có thể làm những gì
 */

package java_core.oop.java_interface_va_abstract;

public interface Style {
    int MAX = 100; // trong interface mặc định biến là hằng số
    public String food(); // trong interface mặc định phương thức là abstract
    public String drink();
    public String hobby();
}
