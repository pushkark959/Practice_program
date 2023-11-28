package day8;

public class Employee {

	
	int eid;
	String ename;
	double esal;
	int deptno;
	String Job;
	void display()
	
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
		System.out.println(deptno);
		System.out.println(Job);
		
		
	}
	public static void main(String[] args) {
		 
		
		Employee emp1 = new Employee();
		emp1.eid =100;
		emp1.ename = "Max";
		emp1.esal = 40000.00;
		emp1.deptno = 11;
		emp1.Job = "Manager";
		emp1.display();
		
		
		
	}

}
