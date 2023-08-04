import java.util.Scanner;

// simple switch case

public class pro42 {

    public static void main(String[] args) {
        int ip1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number");
        ip1 = sc.nextInt();
        
        
        switch(ip1){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Satrday");
                break;
            }
            default:{
                System.out.println("out of range");
                break;
            }
        }
    }
}
