import java.util.Scanner;

public class SumOFOddNums {
// To find the sum of all odd number from 1 to n
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range for the sum");
		int n=sc.nextInt();
		
		SumOFOddNums object = new SumOFOddNums();
		object.SumOfOdd(n);

	}

	public void SumOfOdd(int n){
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2!=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println("Sum of odd nummbers from 1 to "+n+" = "+sum);
	}
}
