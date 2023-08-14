class Demo5{
    int i, j, k;
    
    Demo5(int i1, int j1, int k1){
        i = i1;
        j = j1;
        k = k1;
    }
    
    public void printer(){
        System.out.println("i is "+i+" j is "+j+" k is "+k);
    }
}

public class Pro5 {
    public static void main(String[] args) {
        Demo5 d5 = new Demo5(11, 22, 33);
        
        d5.printer();
        
    }
}
