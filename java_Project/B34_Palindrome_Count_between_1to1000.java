package java_Project;

public class B34_Palindrome_Count_between_1to1000 {

	public static void main(String[] args) {
		// 34.Count of the palindrome number
		int count = 0;
		for (int i=1;i<1000;i++) {
			int no =i;
			//int r;
			int s=0;
			
			while(no>0) {
				 int r=no%10;
				s=(s*10)+r;
				no = no/10;
			}
			
			if(s==i) {
				count++;
			}
		}
		System.out.println("Count of palindrome Number : "+count);

	}

}
