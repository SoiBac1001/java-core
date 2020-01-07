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
public class JFrameDemo {
    private JFrame frame;
    JButton button;

    public JFrameDemo() {
        creatAndShow();
    }
    
    public void creatAndShow(){
        button = new JButton("Ok");
        frame = new JFrame("Test");
//        frame.setSize(400, 300); // set kích thước frame (rộng, cao)
        frame.setVisible(true); // hiển thị frame
        frame.setLocationRelativeTo(null); // hiển thị frame giữa màn hình
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // tắt frame nó sẽ tắt hẳn luôn
        
//        frame.pack(); // tạo ra 1 frame nhỏ
        frame.add(button); // Thêm một thành phần trên một thành phần khác
        frame.setLayout(new FlowLayout()); // Thiết lập Layout Manager cho thành phần
    }
    
    public static void main(String[] args) {
        new JFrameDemo();
    }
}
