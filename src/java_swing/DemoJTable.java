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
public class DemoJTable extends JFrame{

    public DemoJTable() {
        String[] titles = new String[]{"STT", "Môn học", "Tác giả", "Tổng Số"};
        Object[][] objects = new Object[][]{
            {1, "JSP & Servlet", "Tùng Dương", 22},
            {2, "Spring Framework", "Mạnh Sơn", 20},
            {3, "Struts Framework", "Công Minh", 19}
        };
        
        JTable table = new JTable(objects, titles); // hàng (dữ liệu), cột
        add(new JScrollPane(table));
        setTitle("Hello");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }  
    
    public static void main(String[] args) {
        new DemoJTable();
    }
}
