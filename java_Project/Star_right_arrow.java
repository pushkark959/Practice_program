package java_Project;

public class Star_right_arrow {

	public static void main(String[] args) {
		// Print  right arrow  with Stars
		
		{
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}}
