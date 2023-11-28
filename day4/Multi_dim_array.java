package day4;

public class Multi_dim_array {

	public static void main(String[] args) {
		int a[][]= new int [3][2];
		a[0][0] =100;
		a[0][1] =200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600; 
		
		//int a[][] = { {100,200}, {300,400}, {500,600} };
	    System.out.println("Number of present Rows : " +a.length);
		System.out.println("Number of Column : "+ a[0].length);
		
		for (int i = 0; i<a.length; i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
	}

}
