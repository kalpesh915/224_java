class Example1{
    static int ip;
    
    static {
        ip = 100; /// static declaration block
    }
    
    public static void printer(){
        System.out.println("ip is "+ip);
    }
}

public class StaticDemo1 {
    public static void main(String[] args) {
        System.out.println(Example1.ip);
        Example1.printer();
    }
}
