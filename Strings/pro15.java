
public class pro15 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
