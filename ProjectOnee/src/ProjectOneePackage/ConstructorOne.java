
// Create default and Parameterized constructor .

package ProjectOneePackage;



	public class ConstructorOne {

	// Create constructor method .. type class name then control + space
		
		public ConstructorOne() {
			
	// then print the message 
			
			System.out.println(" default constructor");
	}
				
		public ConstructorOne(int a ) {
			
			System.out.println(" one Parameterized constructor");
	}
		
		public ConstructorOne(int a , int b) {
			
			System.out.println(" two  Parameterized constructor");
	}	

	// main method 
		public static void main(String[] args) {
	// object creation
			ConstructorOne obj1 =new ConstructorOne();
			ConstructorOne obj2=new ConstructorOne(10);
			ConstructorOne obj3=new ConstructorOne(11 , 13);
		}

}
