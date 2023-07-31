import java.util.Scanner;
class pro8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int ip1, ip2, ans;

		System.out.println("Enter value for ip1");
		ip1 = sc.nextInt();
		System.out.println("Enter value for ip2");
		ip2 = sc.nextInt();
		ans = ip1 + ip2;
		System.out.println("Sum of ip1 and ip2 is "+ ans );
	}
}