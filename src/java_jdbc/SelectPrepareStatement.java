/**
 * public int executeUpdate(): Thực hiện truy vấn. Nó được sử dụng để create, drop, insert, update, delete, vv.
 * Nguồn: http://viettuts.vn/java-jdbc/preparedstatement-trong-java
 */
package java_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Nguồn: https://www.youtube.com/watch?v=2bRHnCt9aSY&list=PLsfLgp1K1xQ51TV6pCyS9yNQvstVk_le_&index=34
 * @author os_baonv
 */
public class SelectPrepareStatement {
    public static void main(String[] args) {
        Connection connection = JDBC_Connection.getConnection();
        String sql = "SELECT * FROM Person WHERE id = ? OR name = ?";
//        String sql1= "INSERT INTO Person VALUES(?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 3); // 1: vị trí dấu "?" // 3 là giá trị truyền vào "?" // cột int thì dùng setInt()
            preparedStatement.setString(2, "minh"); // 2: vị trí dấu "?" // minh là giá trị truyền vào "?" // cột varchar thì dùng setString()
            ResultSet rs = preparedStatement.executeQuery(); // Thực hiện truy vấn chọn. Nó trả về một thể hiện của ResultSet.
            System.out.println("ID\t" + "NAME");
            while(rs.next()){
//                System.out.println(rs.getInt("id") + "\t" + rs.getString("name"));
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2)); // cột "id" ở cột 1, cột "name" ở cột 2
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectPrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
