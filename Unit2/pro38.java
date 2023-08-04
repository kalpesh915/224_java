import java.util.Scanner;

// find maximum out of two numbers

public class pro38 {

    public static void main(String[] args) {
        int ip1, ip2, ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for ip1");
        ip1 = sc.nextInt();
        System.out.println("Enter value for ip2");
        ip2 = sc.nextInt();

        if (ip1 > ip2) {
            ans = ip1;
        } else {
            ans = ip2;
        }
        
        System.out.println("Maximum is "+ans);
    }
}
