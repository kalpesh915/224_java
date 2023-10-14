import java.sql.*;
import java.util.Scanner;

public class pro3 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/426laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            
            Scanner sc = new Scanner(System.in);
            String fname, lname, email, phone, city, query;
            
            System.out.println("Enter First Name");
            fname = sc.next();
            System.out.println("Enter Last Name");
            lname = sc.next();
            System.out.println("Enter City Name");
            city = sc.next();
            System.out.println("Enter Phone");
            phone = sc.next();
            System.out.println("Enter Email");
            email = sc.next();
            
            query = "insert into students (fname, lname, email, city, phone) values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, fname);
            preparedStatement.setString(2, lname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, city);
            preparedStatement.setString(5, phone);
            
            int ans = preparedStatement.executeUpdate();
            System.out.println("Data Inserted "+ans);
            
            
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
