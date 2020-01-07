/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author os_baonv
 */
public class JDBC_Example {
    public static void main(String[] args) throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "soibac1001", "baosql76");
        myStmt = (Statement) myConn.createStatement();
        String sql = "select * from employees";
        myRs = myStmt.executeQuery(sql);
    }
}
