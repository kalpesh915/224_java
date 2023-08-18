
public class FinalDemo1 {

    public static void main(String[] args) {
        final int x = 10;
        System.out.println("value of x is " + x);
        /// x = 100; /// error cannot update final varible
        System.out.println("value of x is " + x);
    }
}
