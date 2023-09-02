
public class Pro6 {

    public static void main(String[] args) {
        ThreadDemo td1 = new ThreadDemo("Thread 1");
        System.out.println("Thread Name is "+td1.t.getName());
        td1.t.setName("Demo Thread");
        System.out.println("Thread Name is "+td1.t.getName());
        System.out.println("Thread id is "+td1.t.getId());
    }
}
