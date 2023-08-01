/**
 *
 example of static variable
 */

public class pro6 {
    static int x = 1;
    public static void main(String[] args) {
        for(int i=1;i<=10; i++){
            printer();
        }
    }
    
    public static void printer(){
        System.out.println("x is "+x);
        x++;
    }
}
