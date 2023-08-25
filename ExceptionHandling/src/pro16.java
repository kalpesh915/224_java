class FinalizeDemo{

    public FinalizeDemo() {
    }
}

public class pro16 {
    public static void main(String[] args) {
        FinalizeDemo fd1 = new FinalizeDemo();
        FinalizeDemo fd2 = new FinalizeDemo();
        
        fd1 = null;
        fd2 = null;
        
        System.gc(); // finalize
    }
}
