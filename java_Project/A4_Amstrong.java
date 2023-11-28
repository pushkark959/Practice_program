package java_Project;

import java.util.Scanner;

public class A4_Amstrong {

	public static void main(String[] args) {
		
		//4. Check whether the number is amstrong or not
		int n,r;
		System.out.println("Enter Your Number : ");
		int s=0;
		 
		Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
				int c=n;
				while(n>0) {
				r = n%10;
				s = (r*r*r)+s;
				//System.out.println(s);
				n=n/10;
				}
		if(c==s) {
			System.out.println("It is Armstrong Number..");
		}
		else {
			System.out.println("It is Not Armstrong Number..");
		}

	}

}
