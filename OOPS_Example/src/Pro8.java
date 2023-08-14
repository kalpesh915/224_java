class Box2{
    int h, w, b;
    // default constructor
    public Box2() {
        this.h = 5;
        this.w = 6;
        this.b = 7;
    }
    
    public void volume(){
        System.out.println("Volume of Box is "+(h * w * b));
    }
}

public class Pro8 {
    public static void main(String[] args) {
        Box2 b2= new Box2();
        b2.volume();
    }
}
