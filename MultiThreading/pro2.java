
class Demo2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i is " + i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Error is " + e);
            }
        }
    }
}

public class pro2 {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        Thread t1 = new Thread(d2);
        t1.start();
        t1.start();/// Error 
    }
}
