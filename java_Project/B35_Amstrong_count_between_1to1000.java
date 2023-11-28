package java_Project;

public class B35_Amstrong_count_between_1to1000 {

	public static void main(String[] args) {
		// 35. Count of the amstrong number
		
		int count = 0;
		for(int i=1;i<1000;i++) {
			int no = i;
			int r;
			int s = 0;
			while(no>0) {
				r = no%10;
				s = (r*r*r)+s;
				no = no/10;
			}
			if(s==i) {
				count++;
				//System.out.println("Armstrong Number : "+i);
			}
		}
		System.out.println("Count of Armstrong : "+count);

	}

}
