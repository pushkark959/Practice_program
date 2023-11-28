package java_Project;

import java.util.Scanner;

public class A1_Factorial {

	public static void main(String[] args) {
		//1.Find the Factorial of the given number
		
				/*
				int n = 5;
				int fact =n;
				for (int i = (n-1); i>1; i--)
				{
					fact = fact*i;
				}
				System.out.println(fact);
		       
				
				int n=5;
				int fact =1;
				for (int i=1;i<=n;i++) {
					fact = fact*i;			
				}
				System.out.println(fact);
				
			 */
		int n;
		System.out.println("Enter a number...");
		int fact=1;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			fact = fact*i;
			
		}
		System.out.println("Factorial the your Number : "+ fact);
		
		
			}

	

}
