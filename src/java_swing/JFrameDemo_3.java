/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author 13a0_pr0_96
 */
public class JFrameDemo_3 extends JFrame implements ActionListener{ // thiết lập sự kiện, sử dụng interface ActionListener
    JButton okButton, exitButton, cancelButton;

    public JFrameDemo_3() {
        creatAndShow();
    }
    
    public void creatAndShow(){
        okButton = new JButton("Ok");
        exitButton = new JButton("Exit");
        cancelButton = new JButton("Cancel");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true); // hiển thị frame
        
        this.add(okButton);
        okButton.setActionCommand("ok"); // id của button
        okButton.addActionListener(this); // bắt sự kiện và xử lý
        okButton.setMnemonic(KeyEvent.VK_O); // thiết lập phím tắt
        okButton.setToolTipText("Click nút này để xác nhận"); // chú thích khi trỏ chuột vào nút đó
        
        add(cancelButton);
        cancelButton.setActionCommand("cancel");
        cancelButton.addActionListener(this);
        cancelButton.setMnemonic(KeyEvent.VK_C);
        cancelButton.setToolTipText("Click nút này để hủy thao tác vừa chọn");
        
        add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
        exitButton.setMnemonic(KeyEvent.VK_E);
        exitButton.setToolTipText("Click vào nút này để thoát"); // chú thích khi trỏ chuột vào nút đó
    }
    
    public static void main(String[] args) {
        new JFrameDemo_3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ok".equals(e.getActionCommand())){
            JOptionPane.showConfirmDialog(rootPane, "Bạn vừa nhấn nút ok !");
        }
        
        if("cancel".equals(e.getActionCommand())){
            JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn hủy không ?");
        }
        
        if("exit".equals(e.getActionCommand())){
            System.exit(0);
        }
    }
}
