//First usage of " this keyword" in case of constructor -- using this keyword the output should be  three , one , two , default

package ProjectOneePackage;

public class thisKeywordConstructor {
	
     public thisKeywordConstructor( ) {
    	this(8,9);   // two parameters
		System.out.println("default constructor");
	}
	
	 public thisKeywordConstructor(int a ) {
		
		this(7,9,0); // three
		System.out.println("one parameterized constructor");
	}
    
    public thisKeywordConstructor(int a , int b) {
    	this(7); // one
		System.out.println("two parameterized constructor");
	}
    
    public thisKeywordConstructor(int a , int b , int c) {
    	
		System.out.println("three parameterized constructor");
	}
    
    public thisKeywordConstructor(int a , int b , int c , int d) {
    	
		System.out.println("four parameterized constructor");
	}
    
    public static void main(String[] args) {
    	thisKeywordConstructor obj = new thisKeywordConstructor(); // default parameterized 
    	
		
	}
}
