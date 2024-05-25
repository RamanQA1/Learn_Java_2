package basicCoding;

public class MyClass {

//	int i ;
//	
//	public static void main(String[] args) {
//		
//		MyClass myClass =new MyClass();
//		myClass.initialize();
//		
//		System.out.println(myClass.i);
//		
//	}
//	
//	public void initialize() {
//		
//		i=10;
//	}
//	
	////////////////////////////////////////////////////////

//      int i=10 ;
//	
//	public static void main(String[] args) {
//		
//		MyClass myClass =new MyClass();
//		
//		
//		System.out.println(myClass.i);
//		
//	}

	///////////////////////////////////////////////////////////

//	int i;
//
//	MyClass(int i) {
//
//		this.i = i;
//
//	}
//
//	public static void main(String[] args) {
//
//		MyClass myClass = new MyClass(7);
//
//		System.out.println(myClass.i);
//
//	}

	///////////////////////////////////////////////////////////////

	
	  int i;
	  
	  public static void main(String[] args) {
	  
	  MyClass myClass =new MyClass(); myClass.initialize();
	  MyClass myClass1 =new MyClass(); //we are agin creating new object of the class since it will resetall the non static variables
	  
	  System.out.println(myClass1.i);
	  
	  }
	  
	  public void initialize() {
	  
	  i = 10; }
	 

}
