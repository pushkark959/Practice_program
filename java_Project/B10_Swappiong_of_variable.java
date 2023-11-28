package java_Project;

public class B10_Swappiong_of_variable {

	public static void main(String[] args) {
		//10.Swap of two variable without using third variable
		
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping");
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		System.out.println();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
		

	}

}
