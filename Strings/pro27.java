
public class pro27 {
    public static void main(String[] args) {
        String str1 = "Welcome to world of Strings in Java";
        char op[] = new char[100];
        
        str1.getChars(0, 10, op, 0);
        for(char  x : op){
            System.out.println(""+(char)x);
        }
    }
}
