
// we have 5 variables . create constructor then give value and print the value

package ProjectOneePackage;


public class ConstructorTwo {
	
	int a , b , c , d , e ;
	public ConstructorTwo(int x1 , int x2 , int x3 , int x4 , int x5) {
		
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	public static void main(String[] args) {
		
		ConstructorTwo obj = new ConstructorTwo (12 ,33 ,44,105,566);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		
		
	}
		
	}


