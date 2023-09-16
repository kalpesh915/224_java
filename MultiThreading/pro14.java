class Customer{
    int balance = 10000;
    
    synchronized  public void withdraw(int amount){
        System.out.println("Withdraw Process Start");
        if(balance < amount){
            System.out.println("Waiting for Deposit");
            try {
                wait();
            } catch (Exception err) {
                System.out.println("Error is "+err);
            }
        }
        
        balance -= amount;
        System.out.println("Balance is "+balance);
        System.out.println("Withdraw Completed");
    }
    
    synchronized public void deposit(int amount){
        System.out.println("Depoit Started");
        balance += amount;
        System.out.println("Deposit Compeleted");
        notify();
    }
}

public class pro14 {
    public static void main(String[] args) {
        final Customer cst = new Customer();
        
        new Thread(){
            public void run(){
                cst.withdraw(15000);
            }
        }.start();
        
        new Thread(){
            public void run(){
                cst.deposit(40000);
            }
        }.start();
    }
}
