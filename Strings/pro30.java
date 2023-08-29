
public class pro30 {
    public static void main(String[] args) {
        String str1 = "Welcome to world of Strings in Java";
        String data[] = str1.split(" ");
        
        for(String tmp : data){
            System.out.println(tmp);
        }
    }
}
