class demo{
    public void sum(int i, int j){
        System.out.println("Sum is "+(i+j));
    }
}

public class pro2 {
    public static void main(String[] args) {
        demo d = new demo();
        d.sum(111, 345);
    }
}
