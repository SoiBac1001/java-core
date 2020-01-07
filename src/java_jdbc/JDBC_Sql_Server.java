/**
 * Nguồn: http://giasutinhoc.vn/lap-trinh-co-so-du-lieu-voi-jdbc/ket-noi-sql-server-voi-java-bai-3/
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
 * @author 13a0_pr0_96
 */
public class JDBC_Sql_Server {
    private static String DB_URL ="jdbc:sqlserver://localhost:1433;" + "databaseName=Tutorial;" ;
    private static String user = "sa";
    private static String pass ="123";
    
    public static Connection getConnection(String dbURL, String user, String pass){
        Connection conn = null;
        try {          
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // dòng này k quan trọng vì trình quản lý trình điều khiển có thể tự động phát hiện và nạp lớp điều khiển miễn là tệp sqljdbc42.jar có trong đường dẫn classpath
            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Connect successfully !");
        } catch (Exception ex) {
            System.out.println("Connect failure !");
            Logger.getLogger(JDBC_Sql_Server.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return conn;
    }
    public static void main(String[] args) {
        try {
            // connnect to database 'Tutorial'
            Connection conn = getConnection(DB_URL, user, pass);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from student");
            // show data
            while(rs.next()){
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)); // id ở cột 1 => getInt(1) ; first_name ở cột 3 => getString(3)
            }
            
            String sql = "INSERT INTO student VALUES(5,'Hung','HCM')";
            stmt.executeUpdate(sql);
            // close connection
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Sql_Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
