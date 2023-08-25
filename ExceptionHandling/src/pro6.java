
public class pro6 {

    public static void main(String[] args) {
        try{
            System.out.println("Div is " + (10 / 0));
        }catch(ArithmeticException err){
            System.out.println("Error is "+err);
        }
        
        System.out.println("Program is Over");
    }
}
