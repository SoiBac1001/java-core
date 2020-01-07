/**
 * Để kết nối Java với MySQL bằng JDBC, giả sử bạn đã tạo bảng trong MySQL, bạn cần làm theo 4 bước sau:
 * 1. Tải file mysql-connector-java-x.y.zz.zip về máy tại "https://dev.mysql.com/downloads/connector/j/", giải nén ra được file "mysql-connector-java-x.y.zz-bin.jar".
 * 2. Add thư viện JDBC Driver mysql-connector-java-x.y.zz-bin.jar vào thư mục "Libraries" của project (Add JAR/folder...).
 * 3. Gọi phương thức Class.forName(“com.mysql.jdbc.Driver”)
 * 4. Gọi phương thức DriverManager.getConnection() để kết nối đến cơ sở dữ liệu MySQL
 */
package java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author os_baonv
 */
public class JDBC_Connection {
    public static Connection getConnection(){ // phương thức static nên có thể gọi trực tiếp ở class khác thông qua tên class của nó: JDBC_Connection.getConnection()
        Connection conn = null;
        final String url = "jdbc:mysql://localhost:3306/demo";
//        final String user = "soibac1001";
        final String user = "root";
        final String pass = "baosql76";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // tải mysql driver vào // k cần thiết làm bước này
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBC_Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        // connnect to database 'demo'
        Connection connection = getConnection();
        if(connection != null){
            System.out.println("Ket noi thanh cong");
        } else
            System.out.println("Ket noi that bai !");
        try {
            connection.close(); // đóng connection
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
