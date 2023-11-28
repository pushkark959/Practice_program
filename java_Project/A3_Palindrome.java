package java_Project;

public class A3_Palindrome {

	public static void main(String[] args) {
		//3. Check whether the number is palindrome or not
		
		int n=12321;
		int r;
		int s=0;
		int c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(c==s) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
			
		


	}

}
