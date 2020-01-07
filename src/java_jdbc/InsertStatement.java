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
public class InsertStatement {
    public static void insertRecords(int id, String name){
        Connection connection = JDBC_Connection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO Person VALUES(" + id + ",'" + name + "')";
            statement.executeUpdate(sql); // trả về số hàng thêm thành công // ở đây thêm 1 hàng
            String sql1 = "INSERT INTO Person VALUES(" + (id + 1) + ",'minh')";
            int rs = statement.executeUpdate(sql1);
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(InsertStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateRecords(int id, String newName){
        Connection connection = JDBC_Connection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "UPDATE Person SET name = '" + newName + "' WHERE id = " + id;
            int rs = statement.executeUpdate(sql); // trả về số hàng cập nhật thành công // ở đây cập nhật 1 hàng
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(InsertStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteRecords(int id){
        Connection connection = JDBC_Connection.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM Person WHERE id = " + id;
            int rs = statement.executeUpdate(sql); // trả về số hàng xóa thành công // ở đây xóa 1 hàng
            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(InsertStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        insertRecords(3,"tam");
//        updateRecords(1, "nam");
        deleteRecords(2);
    }
}
