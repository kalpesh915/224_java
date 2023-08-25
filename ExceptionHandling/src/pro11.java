
public class pro11 {

    public static void main(String[] args) {
        int ip1 = 10, ip2 = 0;

        try {
            int ans = ip1 / ip2;

            try {
                int data[] = {11, 22};
                data[10] = ans;
            } catch (Exception err) {
                System.out.println("Error is " + err);
            }

        } catch (Exception err) {
            System.out.println("Error is " + err);
        }
    }
}
