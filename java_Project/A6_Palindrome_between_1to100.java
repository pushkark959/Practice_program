package java_Project;

import java.util.Scanner;

public class A6_Palindrome_between_1to100 {

	public static void main(String[] args) {
		
		//6. To print the palindrome available between 0 to 100
//		int n1;
//		System.out.println("Enter Your Ist Number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Ist Number");
			int n1 = sc.nextInt();
			System.out.println("Enter Your Second Number");
			int n2 = sc.nextInt();
			for(int i=n1;i<n2;i++) {
				int no=i;
			int r;
			int s=0;
			//int c=n;
			while(no>0) {
				r = no%10;
				s = (s*10)+r;
				no = no/10;
    	 }
		if (s==i) {
			System.out.println("It is Palindrome : "+i);
		}	
			
	}

}}
