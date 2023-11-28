package java_Project;

public class B19_Ascending_order_number {

	public static void main(String[] args) {
		// 19. Print the numbers in ascending order
		
		int a[] =  {1,23,9,7,2};
		int temp =0;
		System.out.print("Elements of original array : ");
		for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    	
        }   
		
		for (int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];    
	                a[i] = a[j];    
	                a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("After arrange : ");
		for (int i = 0; i < a.length; i++) {  
            System.out.print(a[i] + " ");    	
        }   
		

	}

}
