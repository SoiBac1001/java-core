/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class SelectStatement {
    public static void main(String[] args) {
        Connection conn = JDBC_Connection.getConnection();
        try {
            Statement statement = conn.createStatement();
            final String sql = "select * from employees where id = 3"; // câu lệnh where ở đây có tác dụng lọc dữ liệu và chỉ nhận dữ liệu id = 3
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("ID\t" + "EMAIL");
            while(rs.next()){ // vòng lặp while lặp trên từng hàng dữ liệu
//                System.out.println(rs.getInt(1) + "\t" + rs.getString(4));
                int id = rs.getInt("id");
                String email = rs.getString("email");
                System.out.println(id + "\t" + email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
