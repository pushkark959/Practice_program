package java_Project;

public class B13_Fabonacii_series {

	public static void main(String[] args) {
		// 13. Fibonacci series:
		
		int a=0;
		int b=1;
		int c;
		for(int i=0;i<=10;i++) {
			c=a+b;
			//System.out.println(c);
			a=b;
			b=c;
			System.out.println(c);
		}

	}

}
