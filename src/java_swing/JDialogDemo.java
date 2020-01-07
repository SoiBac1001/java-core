/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_swing;

import javax.swing.JDialog;

/**
 *
 * @author os_baonv
 */
public class JDialogDemo extends JDialog {

    public JDialogDemo() {
        setTitle("Demo JDialog");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300,200);
        setResizable(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new JDialogDemo().setVisible(true);
    }
}
