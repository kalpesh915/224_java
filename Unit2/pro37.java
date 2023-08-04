import java.util.Scanner;

// ladder if

public class pro37 {

    public static void main(String[] args) {
        int ip;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for ip");
        ip = sc.nextInt();

        if (ip > 0) {
            System.out.println("Positive");
        } else if(ip < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
