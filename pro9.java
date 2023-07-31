/*
	swap values of two variables with use of third variable
*/
import java.util.Scanner;
class pro9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int ip1, ip2, tmp;

		System.out.println("Enter value for ip1");
		ip1 = sc.nextInt();
		System.out.println("Enter value for ip2");
		ip2 = sc.nextInt();
		

		System.out.println("before swap value of ip1 is "+ip1+" ip2 is "+ip2);
		
		tmp = ip1;
		ip1 = ip2;
		ip2 = tmp;
		
		System.out.println("after swap value of ip1 is "+ip1+" ip2 is "+ip2);
	}
}