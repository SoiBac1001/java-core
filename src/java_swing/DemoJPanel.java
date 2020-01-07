/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing;

import javax.swing.*;

/**
 *
 * @author 13a0_pr0_96
 */
public class DemoJPanel extends JFrame{

    public DemoJPanel() {
        setTitle("Demo JPanel");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel p = new JPanel();
        p.setBorder(BorderFactory.createTitledBorder("Thong tin sach"));
        p.add(new JLabel("Thu co nhan !"));
        p.add(new JButton("An toi"));
        this.add(p);
    }
    
    public static void main(String[] args) {
        new DemoJPanel().setVisible(true);
    }
}
