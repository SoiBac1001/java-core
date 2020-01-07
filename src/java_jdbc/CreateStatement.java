/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class CreateStatement {
    public static void createTable(){
        Connection connection = JDBC_Connection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE Person(id INT)";
            int rs = statement.executeUpdate(sql); // trả về 0 nếu tạo thành công
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CreateStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteTable(){
        Connection connection = JDBC_Connection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "DROP TABLE Person";
            int rs = statement.executeUpdate(sql); // trả về 0 là đã thực thi thành công
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(CreateStatement.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void main(String[] args) {
//        createTable();
        deleteTable();
    }
}
