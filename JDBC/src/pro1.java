import java.sql.*;

public class pro1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/426laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement statement = connection.createStatement();
            
            // select Data
            ResultSet rs = statement.executeQuery("select * from students");
            
            while(rs.next()){
                System.out.println("Welcome "+rs.getString("fname")+" "+rs.getString("lname")
                        +" city "+rs.getString("city")+" Email is "+rs.getString("email")
                        +" Phone is "+rs.getString("phone"));
            }
            
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
