
import java.io.FileReader;
import java.io.Reader;


public class pro7 {

    public static void main(String[] args) {
        try {
            int ip;
            Reader fr = new FileReader("data11.txt");
            
            ip = fr.read();
            while(ip != -1){
                System.out.print(" "+(char)ip);
                ip = fr.read();
            }
        } catch (Exception err) {
            System.out.println("Error is "+err);
        }
    }
}
