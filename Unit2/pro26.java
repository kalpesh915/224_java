public class pro26 {
    public static void main(String[] args) {
        /*
            logical xor
            return 1 if both bits are diffrent
        */ 
        int ip1 = 10;   // 1010
        int ip2 = 12;   // 1100
                        // 0110
        
        int ans = ip1 ^ ip2;
        
        System.out.println("Answer is "+ans);
    }
}
