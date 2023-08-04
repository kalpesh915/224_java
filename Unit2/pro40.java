import java.util.Scanner;

// find maximum out of three numbers with ladder if

public class pro40 {

    public static void main(String[] args) {
        int ip1, ip2, ip3, ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for ip1");
        ip1 = sc.nextInt();
        System.out.println("Enter value for ip2");
        ip2 = sc.nextInt();
        System.out.println("Enter value for ip3");
        ip3 = sc.nextInt();

        if(ip1 > ip2 && ip1 > ip3){
            ans = ip1;
        }else if(ip2 > ip1 && ip2 > ip3){
            ans = ip2;
        }else{
            ans = ip3;
        }
        
        System.out.println("Maximum is "+ans);
    }
}
