package basicCoding;

public class MyClass_3 {
	
	// You can directly access static variable and static method of different class in this class
	// If the variable and method is non static then we need to create a object of those class...// this example is non include in this class
	
	
	// Both ways works

	/*
	 * public static void main(String[] args) { MyClass_2.initialize22();
	 * System.out.println(MyClass_2.i);
	 * 
	 * }
	 */
//////////////////////////////////////////////////////////////////////
	
	public void myMethod() {
		MyClass_2.initialize22();
		System.out.println(MyClass_2.i);

		
	}
	
	public static void main(String[] args) {
		
		MyClass_3 myClass_3 = new MyClass_3();
		myClass_3.myMethod();
		
	}

}
