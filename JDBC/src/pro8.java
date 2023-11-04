import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

public class pro8 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/628laravel";
            Connection connection = DriverManager.getConnection(url, "root", "");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from images ");
            FileInputStream fin = new FileInputStream("e:/img_avatar.png");

            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                Blob b = rs.getBlob("imagedata");
                byte data[] = b.getBytes(1, (int)b.length());
                FileOutputStream fout = new FileOutputStream("e://ritish.jpg");
                fout.write(data);
                fout.close();
            }
            connection.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
