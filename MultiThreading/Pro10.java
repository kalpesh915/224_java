
class DemonExample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demon Thread");
        } else {
            System.out.println("Worker Thread");
        }
    }
}

public class Pro10 {
    public static void main(String[] args) {
        DemonExample de1 = new DemonExample();
        de1.setDaemon(true);
        de1.start();
    }
}
