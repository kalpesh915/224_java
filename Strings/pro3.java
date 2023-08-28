public class pro3 {

    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "welcome";
        
        String str3 = new String("welcome");
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
