
import java.io.FileOutputStream;


public class pro3 {

    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("data.txt");
            fout.write(65);
            fout.close();
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
