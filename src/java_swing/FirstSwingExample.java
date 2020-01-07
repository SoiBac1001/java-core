/**
 * Có hai cách để tạo một Frame:
 * + Bởi tạo đối tượng của lớp Frame (quan hệ kết hợp - Association)
 * + Bởi kế thừa lớp Frame (quan hệ kế thừa - inheritance)
 */
package java_swing;

import javax.swing.*;

/**
 *
 * @author 13a0_pr0_96
 */

// cách 1: tạo đối tượng của lớp Frame
public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // tạo instance của JFrame
        JButton b = new JButton("Click"); // tạo instance của JButton
        b.setBounds(130, 100, 100, 40); // trục x, truc y, độ rộng, chiều cao // thiết lập vị trí của button
        f.add(b); // thêm button vào trong JFrame
        f.setSize(400, 500); // // set kích thước frame (rộng, cao)
        f.setLayout(null); // không sử dụng Layout Manager
        f.setVisible(true); // hiển thị frame
        f.setLocationRelativeTo(null); // // hiển thị frame giữa màn hình
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt frame nó sẽ tắt hẳn luôn
    }
}
