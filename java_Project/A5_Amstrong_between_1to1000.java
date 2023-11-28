package java_Project;

public class A5_Amstrong_between_1to1000 {

	public static void main(String[] args) {
		
		//5. Print the amstrong number available between 0 to 1000
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Ist Number ..");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd Number ..");
		int num2 = sc.nextInt();
		*/
		int num1 =1;
		int num2 =1000;
		
		int r;
		
		for(int i=num1;i<=num2;i++) {
			int no=i;
			int s=0;
		while(no>0) {
			r = no%10;
			s = (r*r*r)+s;
			no=no/10;
		}
		if(s==i) {
			System.out.println(s);
		}
//		else {
//			System.out.println("Not Armstrong");
//		}

	}

}}
