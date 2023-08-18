class InstanceDemo{
    int x;
    
    {
        // instance iniltlize block
        x = 100;
    }
    
    public void print(){
        System.out.println("x is "+x);
    }
}

public class InstanceIniltDemo1 {
    public static void main(String[] args) {
        InstanceDemo id = new InstanceDemo();
        id.print();
    }
}
