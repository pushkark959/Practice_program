package day4;

public class Greatest_amallest_Number_of_array {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66,77,88,99,100};
		int max = a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]>max)
					{
				max=a [i];
		}
				
		}
		System.out.println("Greatest Number : "+max);
		int min = a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]<min)
					{
				min=a [i];
					}
				
		}
		System.out.println("Least Number : "+min);
					
		

	}

}
