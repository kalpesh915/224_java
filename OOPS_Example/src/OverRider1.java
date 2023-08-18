class Bank{
    public void getRates(){
        System.out.println("Ask to Specific Bank");
    }
}

class SBI extends Bank{
    public void getRates(){
        System.out.println("Rates of SBI is 8%");
    }
}

class ICICI extends Bank{
    public void getRates(){
        System.out.println("Rates of ICICI is 8.5%");
    }
}

class AXIS extends Bank{
    public void getRates(){
        System.out.println("Rates of AXIS is 9%");
    }
}

public class OverRider1 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getRates();
        ICICI icici = new ICICI();
        icici.getRates();
        
        // Another Way
        Bank b = new SBI();
        b.getRates();
        b = new ICICI();
        b.getRates();
        b = new AXIS();
        b.getRates();
    }
}
