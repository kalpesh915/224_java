class MyMaths1{
    public void div(int i, int j) throws ArithmeticException{
        System.out.println("Error is "+(i/j));
    }
}

public class pro14 {
    public static void main(String[] args) throws ArithmeticException{
        MyMaths1 mm1 = new MyMaths1();
        try{
            mm1.div(111, 0);
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
        
    }
}
