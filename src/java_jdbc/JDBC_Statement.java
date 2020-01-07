/**
 * Statement interface trong java cung cấp các phương thức để thực thi các câu lệnh truy vấn với cơ sở dữ liệu SQL
 * Đối tượng của ResultSet duy trì một con trỏ trỏ đến một hàng của một bảng. Ban đầu, con trỏ trỏ đến hàng đầu tiên.
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
public class JDBC_Statement {
    public static void main(String[] args) {
    	Connection con = null;
        try {
            con = JDBC_Connection.getConnection(); // phương thức static nên có thể gọi trực tiếp ở class khác thông qua tên class của nó: JDBC_Connection.getConnection()
            // create statement
            Statement statement = con.createStatement(); // Tạo một đối tượng Statement được sử dụng để thực thi các câu truy vấn SQL.
            String sql = "select * from employees";
            // get data from table 'employees'
            ResultSet rs = statement.executeQuery(sql); // trả về tập kết quả sau khi thực thi các câu lệnh // thực hiện truy vấn SELECT. Nó trả về đối tượng của ResultSet.
            System.out.println("ID\t" + "FIRST_NAME");
            // show data
            while(rs.next()){ // lặp các phần tử trong mảng được lấy ra // Trả về false nếu cuối bảng
                /*
                int id = rs.getInt("id"); // tên cột cần get
                String first_name = rs.getString("first_name"); // map đúng kiểu dữ liệu: first_name trong sql là kiểu "var_char" thì ở java là "string"
                System.out.println(id + "\t" + first_name);
                */
                
                System.out.println(rs.getInt(1) + "\t" + rs.getString(3)); // id ở cột 1 => getInt(1) ; first_name ở cột 3 => getString(3) // Cột đầu tiên đánh số là 1
            }
            statement.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_Statement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}
