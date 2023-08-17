class ThisDemo2{
    int ip1, ip2;
    
    ThisDemo2(int ip1, int ip2){
        this.ip1 = ip1;
        this.ip2 = ip2;
        
        ///this.printer();
        printer();
    }
    
    public void printer(){
        System.out.println("ip1 is "+ip1+" ip2 is "+ip2);
    }
}

public class ThisExample2 {
    public static void main(String[] args) {
        ThisDemo2 td2 = new ThisDemo2(11, 22);
    }
}
