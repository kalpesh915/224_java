
public class pro28 {
    public static void main(String[] args) {
        String str1 = "Welcome to world of Strings in Java";
        System.out.println(str1.indexOf('o'));
        System.out.println(str1.indexOf('o', 10));
        
        System.out.println(str1.intern());
        System.out.println(str1.isEmpty());
        System.out.println(String.join("-", "welcome","to","java"));
    }
}
