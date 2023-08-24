public class pro1 {
    public static void main(String[] args) {
        Calculation3 c3 = new Calculation3();
        
        /// c3.sum(111, 22); private cannot called
        /// c3.sub(121, 22); default only access from package
        c3.mul(121, 22);
        c3.div(131, 22);
        /// c3.mod(141, 22); protected called only from child class
    }
}
