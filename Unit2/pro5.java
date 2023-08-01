/**
 *
 example of static variable
 */

public class pro5 {
    public static void main(String[] args) {
        for(int i=1;i<=10; i++){
            printer();
        }
    }
    
    public static void printer(){
        int x = 1;
        System.out.println("x is "+x);
        x++;
    }
}
