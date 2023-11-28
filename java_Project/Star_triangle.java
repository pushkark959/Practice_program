package java_Project;

public class Star_triangle {

	public static void main(String[] args) {
		// 21.Print Triangle with Stars
		
		for (int i=1;i<=5;i++) {
			for (int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
       
   }
	}


