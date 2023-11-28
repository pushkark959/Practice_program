package day14;

import java.util.Scanner;

public class HandelException {

	public static void main(String[] args) {
		System.out.println("Program is Starteed..");
		System.out.println("Program is in Progress..");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		try
		{
			System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You have Entered Invalid Number");
		}
		System.out.println("Program is Completed..");
		System.out.println("Program is in Exited..");
		

	}

}
