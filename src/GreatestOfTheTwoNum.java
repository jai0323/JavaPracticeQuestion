import java.util.Scanner;

// To find the greatest of the two numbers
public class GreatestOfTheTwoNum {

	public static void main(String arg[]) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		a=sc.nextInt();
		System.out.println("Enter the Second Number");
		b=sc.nextInt();
		
		if(a>b)
			System.out.println("Greater is "+a);
		else
			System.out.println("Greater is "+b);
	}
}
