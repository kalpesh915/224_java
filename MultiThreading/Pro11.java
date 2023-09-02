
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class WorkerThread implements Runnable {
    int ip;
    public WorkerThread(int ip) {
        this.ip = ip;
        System.out.println("Thread Created for " + ip);
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(ip + " * " + i + " : " + (ip * i));
                Thread.sleep(1000);
            } catch (Exception err) {
                System.out.println("Error is " + err);
            }
        }
    }
}

public class Pro11 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 1; i<=10; i++){
            Runnable tmp = new WorkerThread(i);
            executorService.execute(tmp);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){
            
        }
        System.out.println("Program is Over");
    }
}
