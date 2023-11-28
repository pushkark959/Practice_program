package java_Project;

public class B38_Sum_of_odd_even_number_1to100 {

	public static void main(String[] args) {
		// 38.Sum of the odd and even number
		
		//System.out.println("Even Number : ");
		//System.out.print("Odd Number : ");
		int count_even = 0;
		int count_odd = 0;
		int add_even = 0;
		int add_odd = 0;
		for(int i=1;i<=100;i++) 
			
		{
			if(i%2==0) {
				count_even++;
				add_even = add_even+i;
				System.out.println(i+" : Even Number ");
			}
		else if(i%2==1) {
			    count_odd++;
			    add_odd = add_odd+i;
				System.out.println(i+" : Odd Number ");
			}
		}
		System.out.println(count_even+" : Count of Even Numver");
		System.out.println(count_odd + " : Count of Odd Number");
		System.out.println(add_even+" : Sum of Even Number");
		System.out.println(add_odd+" : Sum of Odd Number");

	}

}
