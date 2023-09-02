
public class Pro8 {

    public static void main(String[] args) {
        ThreadDemo td1 = new ThreadDemo("Thread 1");
        ThreadDemo td2 = new ThreadDemo("Thread 2");
        ThreadDemo td3 = new ThreadDemo("Thread 3");
        
        try{
            td3.t.setPriority(10);
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
    }
}
