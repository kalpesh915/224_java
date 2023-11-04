
import java.sql.*;

public class pro6 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/628laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            DatabaseMetaData meta = connection.getMetaData();

            String table[] = {"TABLE"};
            ResultSet rs = meta.getTables(null, null, null, table);

            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is " + e);
        }
    }
}
