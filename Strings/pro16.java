
public class pro16 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
