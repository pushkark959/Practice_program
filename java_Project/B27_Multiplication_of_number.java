package java_Project;

import java.util.Scanner;

public class B27_Multiplication_of_number {

	public static void main(String[] args) {
		// 27. Multiplication of the given number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int x = sc.nextInt();
		int y;
		for (int i=1;i<=10;i++) {
			y=x*i;
			System.out.println(x+" "+"*"+" "+i+" "+ "="+" "+y);
		}
	}

}
