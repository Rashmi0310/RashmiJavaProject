// global - create variable inside the class and outside the method and we 
// use that variable in whole class. 
// local -- create variable inside the method and we can use that variable
// in that method only . 

package ProjectOneePackage;

public class VariableLocalGlobal {
	
	int rashmi;  // global variable 
	public void method() {
		rashmi=55;
		int varun; // local variable 
		System.out.println(" first method");
	}
	
	public void method2() {
		rashmi=33;
		
		System.out.println("second method");
	}
	

}
