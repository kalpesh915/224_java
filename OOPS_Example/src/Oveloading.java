class Maths{
    public void sum(int i, int j){
        System.out.println("Sum is "+(i+j));
    }
    public void sum(float i, float j){
        System.out.println("Sum is "+(i+j));
    }
    public void sum(int i, int j, int k){
        System.out.println("Sum is "+(i+j+k));
    }
    public void sum(int i, int j, int k, int l){
        System.out.println("Sum is "+(i+j+k+l));
    }
}

public class Oveloading {
    public static void main(String[] args) {
        Maths m1 = new Maths();
        m1.sum(11.22f, 33.55f);
    }
}
