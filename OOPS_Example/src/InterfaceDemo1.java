
import java.util.Scanner;

interface myMaths{
    public void sum(int i, int j);
    public void sub(int i, int j);
    public void mul(int i, int j);
    public void div(int i, int j);
}

class Calculcation implements myMaths{

    @Override
    public void sum(int i, int j) {
        System.out.println("Sum is "+(i+j));
    }

    @Override
    public void sub(int i, int j) {
       System.out.println("Sub is "+(i-j));
    }

    @Override
    public void mul(int i, int j) {
       System.out.println("Mul is "+(i*j));
    }

    @Override
    public void div(int i, int j) {
        System.out.println("Div is "+(i/j));
    }
    
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Calculcation c = new Calculcation();
        int i, j;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value for i");
        i = sc.nextInt();
        System.out.println("Enter value for j");
        j = sc.nextInt();
        
        c.sub(i, j);
        c.sum(i, j);
        c.div(i, j);
        c.mul(i, j);
    }
}
