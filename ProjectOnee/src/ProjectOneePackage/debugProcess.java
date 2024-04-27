// How to debug the code in case of method

package ProjectOneePackage;

public class debugProcess {
	
    int rashmi;
    public void method1() {
    	
    	System.out.println(" first method");
    	System.out.println(" second method");
    }
    public void method2() {
    	System.out.println(" third method");
    	System.out.println(" fourth method");
    }
    
// main method
    public static void main(String[] args) {
		System.out.println("main method");
		debugProcess d = new debugProcess();
		d.rashmi =12;
		System.out.println(" value of rashmi" + d.rashmi);
		d.rashmi =13;
		System.out.println("value of rashmi"+ d.rashmi);
		d.method1();
		System.out.println(" first main method");
		d.method2();
		System.out.println(" second main method");
	}

}
