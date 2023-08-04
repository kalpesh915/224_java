
import java.util.Scanner;

public class pro35 {

    public static void main(String[] args) {
        int ip;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for ip");
        ip = sc.nextInt();

        if (ip % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
