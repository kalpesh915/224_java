
import java.util.Scanner;

// parent
class Math1{
    public void sum(int ip1, int ip2){
        System.out.println("Sum is "+(ip1 + ip2));
    }
    
    public void sub(int ip1, int ip2){
        System.out.println("Sub is "+(ip1 - ip2));
    }
}

// child class
class Math2 extends Math1{
    public void div(int ip1, int ip2){
        System.out.println("div is "+(ip1 / ip2));
    }
    
    public void mul(int ip1, int ip2){
        System.out.println("Mul is "+(ip1 * ip2));
    }
}

class Math3 extends Math2{
    public void mod(int ip1, int ip2){
        System.out.println("Mod is "+(ip1 % ip2));
    }
    
    public void square(int ip1){
        System.out.println("Square is "+(ip1 * ip1));
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Math3 m3 = new Math3();
        int ip1, ip2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value for ip1 ");
        ip1 = sc.nextInt();
        System.out.println("Enter value for ip2 ");
        ip2 = sc.nextInt();
        
        m3.sum(ip1, ip2);
        m3.sub(ip1, ip2);
        m3.mul(ip1, ip2);
        m3.div(ip1, ip2);
        m3.mod(ip1, ip2);
        m3.square(ip1);
    }
}
