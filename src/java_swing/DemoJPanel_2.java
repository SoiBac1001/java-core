/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing;

import javax.swing.*;

/**
 *
 * @author os_baonv
 */
public class DemoJPanel_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame is me");
        JPanel jpan = new JPanel();
        frame.add(jpan);
        JButton btnHello = new JButton("Hello");
        jpan.add(btnHello);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3); // thoát luôn khi đóng frame
    }
}
