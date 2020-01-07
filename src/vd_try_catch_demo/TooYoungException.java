/**
 * Trong TH class cha không có hàm tạo KHÔNG tham số mà chỉ có hàm tạo CÓ tham số
 * => Ở hàm tạo của class con cũng KHÔNG được không có tham số và bắt buộc phải CÓ hàm tạo có tham số. Khi đó trong hàm tạo có tham số này phải thêm từ khóa super(tham_biến)
 * Trong TH class cha CÓ hàm tạo không tham số thì không cần từ khóa super(tham_biến) trong hàm tạo có tham số của class con
 */
package vd_try_catch_demo;

/**
 *
 * @author os_baonv
 */
public class TooYoungException extends AgeException{

//    public TooYoungException(){} // class cha không có hàm tạo không tham số => class con cũng không được có hàm tạo không tham số
    public TooYoungException(String message) {
        super(message);
    }
}
