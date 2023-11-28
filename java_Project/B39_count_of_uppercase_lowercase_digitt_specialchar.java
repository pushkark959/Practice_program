package java_Project;

public class B39_count_of_uppercase_lowercase_digitt_specialchar {

	public static void main(String[] args) {
		//39.Count of Uppercase, lowercase, digits, special character
				String s = "Welcome To JAVA Clas @ 12345";
				int count_lowercase=0;
				int count_uppercase=0;
				int count_number=0;
				int count_speacialchar=0;
				for(int i=1;i<=s.length()-1;i++) {
					char ch = s.charAt(i);
					if(Character.isLowerCase(ch)) {
						count_lowercase++;
					}
					else if(Character.isUpperCase(ch)) {
						count_uppercase++;
					}
					else if(Character.isDigit(ch)) {
						count_number++;
					}
					else {
						count_speacialchar++;
					}
				}
				System.out.println("Count of lower case : "+count_lowercase);
				System.out.println("Count of Upper case : "+count_uppercase);
				System.out.println("Count of Number : "+count_number);
				System.out.println("Count of Special Character : "+count_speacialchar);
				
				
	}

}
