package java_Project;

import java.util.Scanner;

public class B25_PrimeNumber_or_Not {

	public static void main(String[] args) {
		// 25 . Check Whether the given number is prime or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number ...");
		int x = sc.nextInt();
		int count = 0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				count++;
			}
				
		}
		
		if (count==0 ) {
			System.out.println(+x+" : It is a Prime Number");
		}
		else if(count>0 ) {
			System.out.println(x+" : It is not a Prime Number");
		}
		else {
			System.out.println("Invalid Number...Please Enter valid Number");
		}

	}

}
