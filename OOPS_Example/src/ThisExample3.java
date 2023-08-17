class ThisDemo3{
    int ip1, ip2;

    public ThisDemo3() {
        System.out.println("Empty Constructor");
    }
    
    
    ThisDemo3(int ip1, int ip2){
        this();
        this.ip1 = ip1;
        this.ip2 = ip2;
        
        this.printer();
    }
    
    public void printer(){
        System.out.println("ip1 is "+ip1+" ip2 is "+ip2);
    }
}

public class ThisExample3 {
    public static void main(String[] args) {
        ThisDemo3 td3 = new ThisDemo3(11, 22);
    }
}
