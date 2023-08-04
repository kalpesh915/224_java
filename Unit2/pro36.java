
import java.util.Scanner;

public class pro36 {

    public static void main(String[] args) {
        int ip;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for ip");
        ip = sc.nextInt();

        if (ip > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
