import java.util.Scanner;

// simple switch case

public class pro43 {

    public static void main(String[] args) {
        int ip1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number");
        ip1 = sc.nextInt();
        
        
        switch(ip1){
            case 11:
            case 12:
            case 1:
            case 2:{
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5:
            case 6:{
                System.out.println("Summer");
                break;
            }
            case 7:
            case 8:
            case 9:
            case 10:{
                System.out.println("Monsoon");
                break;
            }
            
            default:{
                System.out.println("out of range");
                break;
            }
        }
    }
}
