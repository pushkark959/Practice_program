package day4;

public class String_method {

	public static void main(String[] args) {
		String s = "Welcome ";
		String s1 = " To Java";
		System.out.println(s.length()); // Length of string
		System.out.println(s.concat(s1)); // joining of string
		System.out.println(s); // with space character
		System.out.println(s.trim());// by triming space character from left and right of string
		System.out.println(s.charAt(3)); // return based on index number which start from 0(zero).
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		System.out.println(s.equals("Welcome "));
		System.out.println(s.equals("welcome "));
		System.out.println(s.equalsIgnoreCase("Welcome "));
		System.out.println(s.replace('e','a')); // replace the string letter e by a
		
		
		s = "Welcome to Java";
		System.out.println(s.replace("java","Selenium"));
		
		s="Welcome";
		System.out.println(s.substring(0,4));
		System.out.println(s.toLowerCase()); // change string in lowercase
		System.out.println(s.toUpperCase()); // change string in upperccase
	}

}
