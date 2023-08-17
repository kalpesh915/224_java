class ThisDemo5{
    int ip1, ip2;

    ThisDemo5(int ip1, int ip2){
        this.ip1 = ip1;
        this.ip2 = ip2;        
        this.printer();
    }   
 
    public void printer(){
        System.out.println("ip1 is "+ip1+" ip2 is "+ip2);
    }
    
    public ThisDemo5 getObject(){
        return this;
    }
}

public class ThisExample5 {
    public static void main(String[] args) {
        ThisDemo5 td5 = new ThisDemo5(11, 22);
        
        ThisDemo5 td55 = td5.getObject();
        td55.printer();
    }
}
