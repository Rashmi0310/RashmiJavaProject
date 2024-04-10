

package ProjectOneePackage;



public class ConstructorAssignment {

	public ConstructorAssignment() 
	{
		
	this(6,7,8);
	System.out.println(" default Constructor");
	
	}
	
	public ConstructorAssignment(int a)
	
	{
    this(1,2,3,4);
		System.out.println(" one Parameterized");
		
	}
	
	public ConstructorAssignment(int a , int b)
	
	{
    this(9);
		System.out.println(" two Parameterized");
		
	}
	
	public ConstructorAssignment(int a , int b ,int c)
	
	{

		System.out.println(" three Parameterized");
	}
	
	public ConstructorAssignment(int a , int b ,int c , int d ) 
	
	{
    this();
		System.out.println(" four Parameterized");
		
	}
	
	public static void main(String[] args) {
		ConstructorAssignment obj = new ConstructorAssignment(5,6);
		
		
	}
}
