
public class pro2 {

    public static void main(String[] args) {
        try {
            int i = System.in.read();
            System.out.println((char)i);
        } catch (Exception err) {
            System.out.println("Error is " + err);
        }

    }
}
