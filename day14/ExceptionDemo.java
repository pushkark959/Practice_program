package day14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		System.out.println(100/num);
		System.out.println("Program is completed...");
		System.out.println("Program is in exited...");
				

	}

}
