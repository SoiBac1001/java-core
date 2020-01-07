/*
 * Để kết nối Java với MySQL bằng JDBC, giả sử bạn đã tạo bảng trong MySQL, bạn cần làm theo 4 bước sau:
 * 1. Tải file mysql-connector-java-x.y.zz.zip về máy tại "https://dev.mysql.com/downloads/connector/j/", giải nén ra được file "mysql-connector-java-x.y.zz-bin.jar".
 * 2. Add thư viện JDBC Driver mysql-connector-java-x.y.zz-bin.jar vào thư mục "Libraries" của project (Add JAR/folder...).
 * 3. Gọi phương thức Class.forName(“com.mysql.jdbc.Driver”)
 * 4. Gọi phương thức DriverManager.getConnection() để kết nối đến cơ sở dữ liệu MySQL
 */
package java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class JDBC_Example_1 {
    private static String DB_URL = "jdbc:mysql://localhost:3306/demo";
    private static String user = "soibac1001";
    private static String pass = "baosql76";
    
    public static Connection getConnection(String dbURL, String user, String pass){
        Connection conn = null;
        try {         
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Example_1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC_Example_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        try {
            // connnect to database 'demo'
            Connection conn = getConnection(DB_URL, user, pass);
            // crate statement
            Statement stmt = conn.createStatement(); // // Tạo một đối tượng Statement được sử dụng để thực thi các câu truy vấn SQL.
            // insert 'employees'
//            stmt.executeUpdate("insert into employees values(13, 'nguyen', 'nam', 'abc@gmail.com', 'HR', '5000.0');");
            
            // get data from table 'employees'
            ResultSet rs = stmt.executeQuery("select * from employees"); // thực hiện truy vấn SELECT. Nó trả về đối tượng của ResultSet.
            // show data
            System.out.println("ID\t" + "FIRST_NAME");
            while(rs.next()){
                System.out.println(rs.getInt(1) + "\t" + rs.getString(3)); // id ở cột 1 => getInt(1) ; first_name ở cột 3 => getString(3)
            }
            // close connection
            conn.close(); // Đóng kết nối và giải phóng tài nguyên JDBC ngay lập tức.
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Example_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
