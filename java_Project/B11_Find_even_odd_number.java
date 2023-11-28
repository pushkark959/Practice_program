package java_Project;

import java.util.Scanner;

public class B11_Find_even_odd_number {

	public static void main(String[] args) {
		// 11. To find even/odd number:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Number ..");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("It is even Number");
		}
		else if(num%2==1) {
			System.out.println("It is odd Number");
		}
		else {
			System.out.println("Please Enter the Valid Number");
		}

	}

}
