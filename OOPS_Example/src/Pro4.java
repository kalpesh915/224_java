class Demo4{
    int i, j, k;
    
    public void setData(int i1, int j1, int k1){
        i = i1;
        j = j1;
        k = k1;
    }
    
    public void printer(){
        System.out.println("i is "+i+" j is "+j+" k is "+k);
    }
}

public class Pro4 {
    public static void main(String[] args) {
        Demo4 d4 = new Demo4();
        
        d4.setData(11, 33, 55);
        d4.printer();
        d4.setData(111, 133, 155);
        d4.printer();
    }
}
