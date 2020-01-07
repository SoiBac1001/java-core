/**
 * Thiết lập 1 interface PT với 1 method abstract toString
 * => Làm điều này để tất cả các class sử dụng interface này (implements) đều bắt buộc phải thực hiện Override lại phương thức này
 * => Nếu không Override lại => LỖI
 */
package bai1_work2;

/**
 *
 * @author os_baonv
 */
public interface PT {
    @Override
    public String toString();
}
