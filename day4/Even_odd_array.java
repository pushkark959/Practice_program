package day4;

public class Even_odd_array {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66,77,88,99,100};
		System.out.println("Even Numbers :  ");
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			
			System.out.println(a[i]);
		}
		
		System.out.println("Odd Numbers :  ");		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]%2!=0)
			
				System.out.println(a[i]);
		}
		
			}
			
}

