package java_Project;

import java.util.HashMap;

public class B23_Count_string_of_individual_character {

	public static void main(String[] args) {
		//23.Find the special character, uppercase, lowercase, Number of digits in the given string
				String s = "Hi Welcome To Java Classes Tommorow At 2.00 p.m!!\\\\";
				int count_lowercase=0;
				int count_uppercase=0;
				int count_number =0;
				int count_specialcharacter=0;
				for(int i=0;i<=s.length() - 1;i++) {
					if(s.charAt(i)>='a' && s.charAt(i)<='z') {
						count_lowercase++;
					}
					else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {	
						count_uppercase++;
					}
					else if(s.charAt(i)>='0' && s.charAt(i)<='9') {	
						count_number++;
					}
					else {
						count_specialcharacter++;
					}
				}
					System.out.println("Count of Lowercase : "+count_lowercase);
					System.out.println("Count of Uppercase : "+count_uppercase);
					System.out.println("Count of Number : "+count_number);
					System.out.println("Count of Special Character : "+count_specialcharacter);
				
		}

	
	
}