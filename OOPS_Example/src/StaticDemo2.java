class Outer{
    static int ip = 150;
    
    static class Inner{
        public static void printer(){
            System.out.println("ip is "+ip);
        }
    }
}


public class StaticDemo2 {
    public static void main(String[] args) {
        Outer.Inner.printer();
    }
}
