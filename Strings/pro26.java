
public class pro26 {
    public static void main(String[] args) {
        String str1 = "Welcome to world of Strings in Java";
        byte data[] = str1.getBytes();
        
        for(byte x : data){
            System.out.println(""+(char)x);
        }
    }
}
