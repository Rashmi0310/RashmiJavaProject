
// (((((10*2)+2)-2)*2)/2)

package ProjectOneePackage;


public class Arithmeticthree {
	
	public int Multiply (int a , int b) {
		int c;
		c=a*b;
		System.out.println("Multiply result is" + c );

		return c;
		
		}
		
		public int Sum (int a1 , int b1) {
			int c1;
			c1=a1+b1;
		
			System.out.println("Sum result is" + c1 );
			return c1;
			
		}
		public int Sub(int a2 , int b2) {
			int c2;
			c2=a2-b2;
			System.out.println("Sub result is" + c2 );

			return c2;	
		}
		
		public void divide (int a3 , int b3) {
			int result ;
			result= a3/b3;
			System.out.println("Divide result is" + result );
		
			}
		
		public static void main(String[] args) {
			Arithmeticthree obj=new Arithmeticthree();
			int Multiplyresullt= obj.Multiply(10, 2);
			int Sumresult= obj.Sum(Multiplyresullt, 2);
			int Subresult= obj.Sub(Sumresult, 2);
			int Multiplyresult2= obj.Multiply(Subresult, 2);
			obj.divide(Multiplyresult2, 2);
		}

}
