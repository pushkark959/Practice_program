package java_Project;

import java.util.Scanner;

public class A8_Sum_of_digit {

	public static void main(String[] args) {
		
		// 8. Find the Sum of the digit
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int r;
		int s=0;
		while(n>0) {
			r=n%10;
			s=s+r;
			n=n/10;
		}
		System.out.println("Sum of the Number : "+s);

	}

}
