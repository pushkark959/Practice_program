package day12;

public class DataConversionMethod {

	public static void main(String[] args) {
		// Convert String into int
		// STRING S = "WELCOMNE"; // Not possible to convert number
		String s1 = "10";
		String s2 = "20";
		System.out.println(s1+s2);  //Result : 1020
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); //Result : 30
		System.out.println();
		
		// Convert String into double
		String s3 = "150.15";
		String s4 = "130.20";
		double s3dbl = Double.parseDouble(s3);
		double s4dbl = Double.parseDouble(s4);
		System.out.println(s3dbl+s4dbl);
		System.out.println();
		
		// Convert String into Boolean
		String s5 = "True";
		boolean bool = Boolean.parseBoolean(s5);
		System.out.println(bool);
		System.out.println();
		
		// Convert int, double, char, boolean into String
		int a=10;
		double d=15.15;
		char c = 'A';
		boolean b = false;
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));

	}

}
