class PropogationDemo{
    public void function1(){
        function2();
    }
    
    public void function2(){
        function3();
    }
    
    public void function3(){
        function4();
    }
    
    public void function4(){
        function5();
    }
    
    public void function5(){
        System.out.println("Div is "+ (100 / 0));
    }
}

public class pro13 {
    public static void main(String[] args) {
        PropogationDemo pd = new PropogationDemo();
        try{
            pd.function1();
        }catch(Exception err){
            System.out.println("Error is "+err);
            err.printStackTrace();
        }
        
    }
}
