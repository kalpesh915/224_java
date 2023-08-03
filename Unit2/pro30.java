
import java.util.Scanner;


public class pro30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ip1, ip2, ans;
        
        System.out.println("Enter value for ip1 ");
        ip1 = sc.nextInt();
        System.out.println("Enter value for ip2 ");
        ip2 = sc.nextInt();
        
        //  (condition ? true : false);
        
        ans = (ip1 > ip2 ? ip1 : ip2);
        
        System.out.println("Answer is "+ans);
    }
}
