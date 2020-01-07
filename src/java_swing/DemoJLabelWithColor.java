/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author os_baonv
 */
public class DemoJLabelWithColor extends JFrame {

    public DemoJLabelWithColor() {
        setLayout(new GridLayout(1,2,5,5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        JLabel lb;
        lb = createJLabel("Hello", Color.red, Color.BLACK);
        Font font = new Font("Arial", Font.BOLD, 40);
        lb.setFont(font);
        add(lb);
        lb = createJLabel("World !", Color.WHITE, Color.BLUE);
        lb.setFont(font);
        add(lb);
        setLocationRelativeTo(null); // hiển thị frame giữa màn hình
//        setVisible(true);
    }
    
    private JLabel createJLabel(String text, Color textColor, Color backgroundColor){
        JLabel lb = new JLabel(text); // set text cho JLabel
        lb.setHorizontalAlignment(JLabel.CENTER);
//        lb.setVerticalAlignment(JLabel.CENTER);
        lb.setForeground(textColor); // set màu chữ
        lb.setOpaque(true);
        lb.setBackground(backgroundColor); // set màu nền
        return lb;
    }
    
    public static void main(String[] args) {
        new DemoJLabelWithColor().setVisible(true);
    }
}
