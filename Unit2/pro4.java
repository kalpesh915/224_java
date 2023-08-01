/*
    instanse of global variable
 */

public class pro4 {
    static int x = 100;
    
    public static void main(String[] args) {
        msg();
        System.out.println("value of x is "+x);
    }
    
    static public void msg(){
        x =110;
        System.out.println("value of x is "+x);
    }
}
