package java_Project;

import java.util.Scanner;

public class B18_Count_string_each_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String s = sc.nextLine();
		int count = 1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
				count++;
		}
		System.out.println("Count of word : "+count);

}
}