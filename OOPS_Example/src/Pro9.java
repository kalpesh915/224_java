class Box3{
    int h, w, b;
    // default constructor
    public Box3() {
        this.h = 1;
        this.w = 1;
        this.b = 1;
        volume();
    }
    
    public Box3(int i) {
        this.h = i;
        this.w = i;
        this.b = i;
        volume();
    }
    
    public Box3(int i, int j) {
        this.h = i;
        this.w = i;
        this.b = j;
        volume();
    }
    
    public Box3(int i, int j, int k) {
        this.h = i;
        this.w = j;
        this.b = k;
        volume();
    }
    
    
    public void volume(){
        System.out.println("Volume of Box is "+(h * w * b));
    }
}

public class Pro9 {
    public static void main(String[] args) {
        //Box3 b3= new Box3();
        Box3 b3= new Box3(5, 8, 7);
        //b3.volume();
    }
}
