
// (10+5) (10-5)


package ProjectOneePackage;


public class Airthmeticone {
	
	public int Sum (int a , int b) {
		int c;
		c=a+b;
		System.out.println("Sum result is" + c );

		return c;	
	}
	public int Sub(int a1 , int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("Sub result is" + c1 );

		return c1;	
	}
	
	public void Multiply(int a2 , int b2) {
		int result ;
		result= a2*b2;
		System.out.println("Multiply result is" + result );
		
	}
	 public static void main(String[] args) {
		
		 Airthmeticone obj=new Airthmeticone();
		 int Sumresult = obj.Sum(10, 5);
		 int Subresult = obj.Sub(10, 5);
		 obj.Multiply(Sumresult, Subresult);
		 
		 
	}

}


