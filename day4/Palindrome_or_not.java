package day4;

import java.util.Scanner;

public class Palindrome_or_not {

	public static void main(String[] args) {
		// 16.To Check the String is palindrome or not.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Value");
		String s = sc.nextLine();
		String p = "";
		for(int i=s.length()-1;i>=0;i--) {
			p=p+s.charAt(i);
		}
//		System.out.println("p" +((Object)p).getClass().getSimpleName());
//		System.out.println("s" +((Object)s).getClass().getSimpleName());
		 
		if(p.equals(s)) {
			
			
		System.out.println("It is the palindrome value: "+p);
		}
		else if(!p.equals(s)){
			System.out.println("It is not the palindrome value: "+p);
		}
		else {
			System.out.println("Please Enter your Valid Value");
		}
	}

}
