
import java.sql.*;

public class pro5 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/426laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            DatabaseMetaData meta = connection.getMetaData();
            
            System.out.println(meta.getDriverName());
            System.out.println(meta.getDriverVersion());
            System.out.println(meta.getDriverMajorVersion());
            System.out.println(meta.getDriverMinorVersion());
            System.out.println(meta.getUserName());
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
