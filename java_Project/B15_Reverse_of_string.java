package java_Project;

public class B15_Reverse_of_string {

	public static void main(String[] args) {
		// 15. Reverse the String
		
		String s = "PUSHKAR";
		String p = "";
		for(int i=s.length()-1;i>=0;i--) {
			p=p+s.charAt(i);	
		}
		System.out.println(p);
		

	}
}
