abstract class Bike{
    abstract public void run();
    public void average(){
        System.out.println("Good Average");
    }
}

class Hero extends Bike{
    public void run(){
        System.out.println("Hero is Running");
        average();
    }
}

class Honda extends Bike{
    public void run(){
        System.out.println("Honda is Running");
        average();
    }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
        Bike b = new Hero();
        b.run();
        b = new Honda();
        b.run();
    }
}
