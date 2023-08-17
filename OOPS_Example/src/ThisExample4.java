class ThisDemo4{
    int ip1, ip2;

    public ThisDemo4() {
        System.out.println("Empty Constructor");
    }
    
    ThisDemo4(int ip1, int ip2){
        this();
        this.ip1 = ip1;
        this.ip2 = ip2;
        
        this.printer();
    }
    
    public void ThisData(ThisDemo4 td){
        System.out.println(""+td.ip1);
    }
    
    public void printer(){
        System.out.println("ip1 is "+ip1+" ip2 is "+ip2);
        ThisData(this);
    }
}

public class ThisExample4 {
    public static void main(String[] args) {
        ThisDemo4 td4 = new ThisDemo4(11, 22);
    }
}
