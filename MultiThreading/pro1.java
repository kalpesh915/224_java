class Demo1 extends Thread{
    public void run(){
        //System.out.println("Thread is Running");
        for(int i = 1; i<=10; i++){
            System.out.println("i is "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error is "+e);
            }
        }
    }
}

public class pro1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.start();
        System.out.println("Main Method is Over");
    }
}
