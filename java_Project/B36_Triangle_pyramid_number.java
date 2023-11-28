package java_Project;

public class B36_Triangle_pyramid_number {

	public static void main(String[] args) {
		// 36.Construct the triangle pyramid
		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i+1;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(k+"");
//			}
//		  System.out.println();
//		}
		/*
		System.out.println();
		for(int i=1;i<=5;i++) {	
			for(int j =i; j >= 1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for (int j=i; j >= 1; j--) {
                System.out.print(j+" ");
            }
			for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
			System.out.println();
		}
		
		 /*
	        for (int i = 1; i <= 5; i++) {
	            // Print numbers from 1 to i in ascending order
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            
	            // Print numbers from i-1 down to 1 in descending order
	            for (int j=i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }
	            
	            // Move to the next line
	            System.out.println();
	        }
	        */

	}

}
