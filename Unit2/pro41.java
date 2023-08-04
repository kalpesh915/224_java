import java.util.Scanner;

// simple switch case

public class pro41 {

    public static void main(String[] args) {
        int ip1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for ip1");
        ip1 = sc.nextInt();
        
        
        switch(ip1){
            case 1:
            {
                System.out.println("one");
                break;
            }
            case 2:
            {
                System.out.println("Two");
                break;
            }
            case 3:
            {
                System.out.println("Three");
                break;
            }
            default:
            {
                System.out.println("out of range");
                break;
            }
        }
    }
}
