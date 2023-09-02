
public class Pro5 {
    public static void main(String[] args) {
        ThreadDemo td1 = new ThreadDemo("Thread 1");
        ThreadDemo td2 = new ThreadDemo("Thread 2");
        ThreadDemo td3 = new ThreadDemo("Thread 3");
        
        try{
            td1.t.join(5000);
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
        System.out.println("Main Thread Over ");
    }
}
