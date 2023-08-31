
import java.io.FileOutputStream;


public class pro4 {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("data1.txt");
            String str1 = "Welcome to Java Files";
            byte ip[] = str1.getBytes();
            fout.write(ip);
            fout.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
