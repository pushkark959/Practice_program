package java_Project;

import java.util.HashSet;

public class B32_Duplicate_count_array {

	public static void main(String[] args) {
		//32. Find the duplicate count in an array
		int a[]= {1,1,2,2,3,3,4,5,6};
		System.out.println("Duplicate Elements are : ");
		//int count=0;
		for(int i=0;i<a.length-1;i++) {
			//count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate Array : "+a[j]);
				}
			}
		}
		
		
		
		
		
		
		
	    /*
		String arr[]= {"java","java"};
		HashSet<String>langs=new HashSet();
		boolean flag=false;
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Found Duplicate Element : "+l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Not Found Duplicate Element : ");
		}
		*/

		
		
	}

}
