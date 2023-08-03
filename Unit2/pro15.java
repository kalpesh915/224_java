import java.util.Scanner;

public class pro15 {
    // Arithmatic operators
    
    public static void main(String[] args) {
        int ip1, ip2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value for ip1 ");
        ip1 = sc.nextInt();
        System.out.println("Enter value for ip2 ");
        ip2 = sc.nextInt();
        
        System.out.println("Sum is  "+ (ip1 + ip2));
        System.out.println("Sub is  "+ (ip1 - ip2));
        System.out.println("Mul is  "+ (ip1 * ip2));
        System.out.println("Div is  "+ (ip1 / ip2));
        System.out.println("Mod is  "+ (ip1 % ip2));
    }
}
