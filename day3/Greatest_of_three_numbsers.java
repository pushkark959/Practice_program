package day3;

public class Greatest_of_three_numbsers {

	public static void main(String[] args) {
		int i=15;
		int j=3;
		int k=7;
		if (i>j && i>k)
		{
			System.out.println("I is the Greatest Number");
		}
		else if (j>i && j>k)
		{
			System.out.println("J is Greatest Number");
			
		}
		else if (k>i && k>j)
		{
			System.out.println("K is the Greatest Number");
		}
		else
		{
			System.out.println("Invalid Number");
		}
			
		
			

	}

}
