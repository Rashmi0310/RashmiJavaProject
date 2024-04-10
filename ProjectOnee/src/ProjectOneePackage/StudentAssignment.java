

package ProjectOneePackage;


public class StudentAssignment {
	
	int age;
	int rollno;
	
	public void method1() {
		System.out.println(" Welcome to all");
	}
	public void method2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		StudentAssignment obj=new StudentAssignment();
		obj.age=26;
		System.out.println("age is"+ obj.age);
		obj.rollno=3;
		System.out.println("Roll no is" + obj.rollno);
		obj.method1();
		obj.method2();
	}

}
