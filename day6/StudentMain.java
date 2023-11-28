package day6;

public class StudentMain {

	public static void main(String[] args) {
	
	
	
		
// Approach 1 : Using reference Variable
		
	/*  Student std = new Student();	
	    std.sid=102;
		std.sname = "John";
		std.grade = 'A';
		std.display();         */
		
// Approach 2 : Using Method
		
	/*	Student std = new Student();
	    std.setData(1022, "John", 'A');
		std.display();      */
		
// Approach 3 : Using Constructor
		
		Student std = new Student(101,"John",'A');
		std.display();
	}	

}
