abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}
