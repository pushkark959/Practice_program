package java_Project;

public class B29_Third_largest_number {

	public static void main(String[] args) {
		// Find the 3rd maximum Number in an given array
		
		int a[]= {1,2,3,3,4,5,6,7,8,9};
		int max = 0;
		System.out.print("Available Numbers : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					max=a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
			
		}
		System.out.println();
		System.out.print("Available Numbers in Descending Order : ");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Third Largest Number : "+a[2]);
				
				
				
		
	}

}
