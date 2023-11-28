package java_Project;

public class B14_Fabonacii_series_upto_100 {

	public static void main(String[] args) {
		// 14. Print the value in Fibonacci series up to 100
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=100;i++) {
			c=a+b;
			a=b;
			b=c;
			if(c>100) {
				break;
			}
			System.out.println(c);
		}

	}

}
