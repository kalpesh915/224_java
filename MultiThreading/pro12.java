class ThreadGroupDemo extends Thread{
    public void run(){
        for(int i=1; i<=10; i++){
            try {
                System.out.println(" i is "+i+" Thread Name is "+Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (Exception err) {
                System.out.println("Error is "+err);
            }
        }
    }
}


public class pro12 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Table Printer");
        ThreadGroupDemo tgd = new ThreadGroupDemo();
        
        Thread t1 = new Thread(tg, tgd);
        Thread t2 = new Thread(tg, tgd);
        Thread t3 = new Thread(tg, tgd);
        Thread t4 = new Thread(tg, tgd);
        Thread t5 = new Thread(tg, tgd);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
     
        ///tg.interrupt();
        tg.destroy();
    }
}
