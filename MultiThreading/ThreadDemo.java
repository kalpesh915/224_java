public class ThreadDemo extends Thread{
    Thread t;
   
    public ThreadDemo(String threadName) {
        t = new Thread(this, threadName);
        System.out.println("New Thread Created "+t);
        t.start();
    }
    
    public void run(){
        for(int i=1; i<=10; i++){
            try{
                System.out.println("Thread is "+t.getName()+" i is "+i);
                t.sleep(1000);
            }
            catch(Exception err){
                System.out.println("Error is "+err);
            }
        }
    }
}
