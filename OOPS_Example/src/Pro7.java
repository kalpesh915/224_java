class Box1{
    int h, w, b;
    // parametrized constructor
    public Box1(int h, int w, int b) {
        this.h = h;
        this.w = w;
        this.b = b;
    }
    
    public void volume(){
        System.out.println("Volume of Box is "+(h * w * b));
    }
}

public class Pro7 {
    public static void main(String[] args) {
        Box1 b1= new Box1(10, 6, 9);
        b1.volume();
    }
}
