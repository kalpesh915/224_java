
import java.io.FileInputStream;


public class pro5 {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("data1.txt");
            int i;
            while((i = fin.read()) != -1){
                //System.out.print(i);
                System.out.print(" "+(char)i);
            }
        } catch (Exception err) {
            System.out.println("Error is " + err);
        }
    }
}
