package java_Project;

public class B12_Count_of_even_and_odd_number {

	public static void main(String[] args) {
		//12. Count of even and odd count
		
		int even_num =0;
		int odd_num =0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				even_num++;
			}
			else {
					odd_num++;
			}
			
		}
		System.out.println("Even Number Count : "+even_num);
		System.out.println("Odd Number Count : "+odd_num);

	}

}
