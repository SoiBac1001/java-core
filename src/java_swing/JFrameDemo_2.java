/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing;

import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author os_baonv
 */
public class JFrameDemo_2 extends JFrame{
    JButton button;

    public JFrameDemo_2() {
        creatAndShow();
    }
    
    public void creatAndShow(){
        button = new JButton("Ok");
        setTitle("New Frame"); // thiết lập tiêu đề cho Frame
        this.setSize(400, 300); // set kích thước (rộng, cao)
        show(); // <=> this.setVisible(true);
//        this.setVisible(true); // hiển thị frame // Thiết lập tính nhìn thấy (visible) của thành phần. Theo mặc định là false
        this.setLocationRelativeTo(null); // hiển thị frame giữa màn hình
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt frame nó sẽ tắt hẳn luôn
        JLabel label = new JLabel("Hello World"); // hiển thị VB tĩnh
        add(label); // k cần this cũng được
        setResizable(true); // Cho phép điều chỉnh kích thước màn hình
        
//        this.pack(); // tạo ra 1 frame nhỏ
        add(button); // Thêm một thành phần trên một thành phần khác
        setLayout(new FlowLayout()); // Thiết lập Layout Manager cho thành phần
    }
    
    public static void main(String[] args) {
        new JFrameDemo_2();
    }    
}
