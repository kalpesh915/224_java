
public class pro8 {

    public static void main(String[] args) {
        try{
            System.out.println("Div is " + (10 / 0));
        }finally{
            System.out.println("Finally block executed");
        }
        
        System.out.println("Program is Over");
    }
}
