class myMaths{
    public void div(int i, int j){
        if(j == 0){
            throw new ArithmeticException("Division not Possible");
        }else{
            System.out.println("Div is "+(i/j));
        }
    }
}
public class pro12 {
    public static void main(String[] args) {
        myMaths mm = new myMaths();
        
        try{
            //mm.div(111, 10);
            mm.div(111, 0);
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
    }
}
