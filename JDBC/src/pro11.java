import java.sql.*;
import java.util.Scanner;

public class pro11 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/628laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            Statement st = connection.createStatement();
            
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish1', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish2', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish3', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish4', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish5', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish6', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish7', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish8', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish9', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("insert into students (fname, lname, email, phone) values ('ritish10', 'solanki', 'r1@gmail.com', '4687578')");
            st.addBatch("delete from students where fname like '%ritish%'");
            st.executeBatch();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error is "+e);
        }
    }
}
