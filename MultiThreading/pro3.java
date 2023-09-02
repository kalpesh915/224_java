
class Demo3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i is " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error is " + e);
            }
        }
    }
}

public class pro3 {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        Thread t1 = new Thread(d3);
        Thread t2 = new Thread(d3);
        //t1.start();
        //t2.start();
        t1.run();
        t2.run();
    }
}
