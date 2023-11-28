package java_Project;

public class B28_Biggest_of_4_number {

	public static void main(String[] args) {
		// 28. Biggest of 4 number
		
		
		int a[]= {10,20,30,40};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println(max);
	}

}
