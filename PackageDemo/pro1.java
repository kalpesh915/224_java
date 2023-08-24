import myMaths.Calculation1;
import myMaths.demo.demo1;

public class pro1 {
    public static void main(String[] args) {
        Calculation1 c1 = new Calculation1();
        myMaths.Calculation2 c2 = new myMaths.Calculation2();
        demo1 d1 = new demo1();
        
        c1.sum(111, 11);
        c1.sub(111, 11);
        c1.mul(111, 11);
        c1.div(111, 11);
        c1.mod(111, 11);
        
        c2.square(4);
        c2.cube(5);
        
        d1.greetings();
    }
}
