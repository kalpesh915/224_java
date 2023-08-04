
import java.util.Scanner;

public class pro33 {
    public static void main(String[] args) {
        int ip;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for ip");
        ip = sc.nextInt();
        
        if(ip >= 18){
            System.out.println("Welcome to voting");
        }
        
        System.out.println("Program is over");
}
}
