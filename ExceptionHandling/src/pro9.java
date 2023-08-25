public class pro9 {

    public static void main(String[] args) {
        try{
            System.out.println("Div is " + (10 / 2));
            int ip[] = {11, 22, 33};
            //ip[10] = 11;
            String ip1 = "rajkot";
            System.out.println(Integer.parseInt(ip1));
        }catch(ArithmeticException err){
            System.out.println("Error is "+err);
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Error is "+err);
        }
        catch(NumberFormatException err){
            System.out.println("Error is "+err);
        }
        finally{
            System.out.println("Finally block executed");
        }
        
        System.out.println("Program is Over");
    }
}
