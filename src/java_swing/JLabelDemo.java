/**
 *  hiển thị văn bản tĩnh
 */
package java_swing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author os_baonv
 */
public class JLabelDemo extends JFrame{

    public JLabelDemo() {
        setLayout(new GridLayout(1, 3, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Icon icon = new ImageIcon("hihi.jfif");
        JLabel lb1 = new JLabel("Nhan la text");
        JLabel lb2 = new JLabel(icon);
        JLabel lb3 = new JLabel("Icon va text", icon, JLabel.CENTER);
        lb3.setVerticalTextPosition(JLabel.BOTTOM);
        lb3.setHorizontalTextPosition(JLabel.CENTER);
        add(lb1);
        add(lb2);
        add(lb3);
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new JLabelDemo().setVisible(true);
    }
}
