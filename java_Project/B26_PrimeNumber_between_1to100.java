package java_Project;

public class B26_PrimeNumber_between_1to100 {

	public static void main(String[] args) {
		// 26. Print the prime numbers counts available between 1 to 100
		
		int count = 0;
		int count_prime = 0;
		for(int i=1;i<=100;i++) {
			count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				count_prime++;
			}
			//count=0;
			
		}
		System.out.println(count_prime);

}
}