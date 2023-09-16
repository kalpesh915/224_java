class Table{
    synchronized public void printTable(int ip){
        try{
            for(int i=1; i<=10; i++){
                System.out.println(ip+" * "+i+" = "+(ip * i));
                Thread.sleep(500);
            }
        }catch(Exception err){
            System.out.println("Error is "+err);
        }
    }
}

class MyTharead1 extends Thread{
    int ip;
    Table table;

    public MyTharead1(int ip, Table table) {
        this.ip = ip;
        this.table = table;
    }
    
    public void run(){
        table.printTable(ip);
    }
}

class MyTharead2 extends Thread{
    int ip;
    Table table;

    public MyTharead2(int ip, Table table) {
        this.ip = ip;
        this.table = table;
    }
    
    public void run(){
        table.printTable(ip);
    }
}

public class pro13 {
    public static void main(String[] args) {
        Table table = new Table();
        
        MyTharead1 mt1 = new MyTharead1(10, table);
        MyTharead1 mt2 = new MyTharead1(15, table);
        
        mt1.start();
        mt2.start();
    }
}
