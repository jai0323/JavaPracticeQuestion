import java.util.Scanner;

// to find power of num
public class PowerOfNum {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		double x=sc.nextInt();
		System.out.println("Enter the power of the number");
		double n=sc.nextInt();
		sc.close();
		double power=Math.pow(x, n);
		System.out.println("Power = "+power);
		
	}
}
