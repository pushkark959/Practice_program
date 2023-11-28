package java_Project;

public class B16_String_is_palindrome_or_not {

	public static void main(String[] args) {
		
		//16.To Check the String is palindrome or not.
		        String s="RADAR";
				String r="";
				for(int i=s.length()-1;i>=0;i--) {
					r=r+s.charAt(i);
				}
				if(s.equals(r)) {
					System.out.println(r+" : It is Palindrome.");
				}
				else {
					System.out.println(r+" : It is NOT Palindrome.");
				}

	}

}
