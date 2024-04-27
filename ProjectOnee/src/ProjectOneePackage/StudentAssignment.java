// how to create class and methods and then print the message and value 

package ProjectOneePackage;


public class StudentAssignment {
// Add variables
	int age;
	int rollno;
// create methods
	public void method1() {
		System.out.println(" Welcome to all");
	}
	public void method2() {
		System.out.println("Automation is very easy");
	}
// main method	
	public static void main(String[] args) {
// object creation
		StudentAssignment obj=new StudentAssignment();
// call variables and methods and give value and print 
		obj.age=26;
		System.out.println("age is"+ obj.age);
		obj.rollno=3;
		System.out.println("Roll no is" + obj.rollno);
		obj.method1();
		obj.method2();
	}

}
