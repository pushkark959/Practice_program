package java_Project;

import java.util.Scanner;

public class A7_Count_of_number {
	
	// 7. Print the count of the given number
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
			int n =	sc.nextInt();
			int count =0;
			while(n>0) {
				 n= n/10;
				 count++;
			}
			System.out.println("Digit Count of your a Number : "+count);	
		
	}

}
