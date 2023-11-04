import java.io.FileInputStream;
import java.sql.*;

public class pro7 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/628laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into images (imagedata) values (?)");
            FileInputStream fin = new FileInputStream("e:/img_avatar.png");
            preparedStatement.setBinaryStream(1, fin, fin.available());
            preparedStatement.execute();
            System.out.println("Image Uplaoded");
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
