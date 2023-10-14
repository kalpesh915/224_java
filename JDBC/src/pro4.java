import java.sql.*;

public class pro4 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/426laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();
            
            // select Data
            ResultSet rs = statement.executeQuery("select * from students");
            ResultSetMetaData meta = rs.getMetaData();
            
            System.out.println(meta.getColumnCount());
            System.out.println(meta.getColumnName(1));
            System.out.println(meta.getColumnType(2));
            System.out.println(meta.getColumnTypeName(2));
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
