import java.util.Scanner;

public class AverageOfThreeNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		a=sc.nextInt();
		
		System.out.println("Enter the second Number");
		b=sc.nextInt();
		
		System.out.println("Enter the Third Number");
		c=sc.nextInt();
		
		//function to print average of 3 numbers
		AverageOfThreeNumber object = new AverageOfThreeNumber();
		object.Average(a, b, c);
				
	}

	public void Average(int a,int b, int c) {
		float avg=(a+b+c)/2;
		System.out.println("Average of three numbers = "+avg);
	}
}
