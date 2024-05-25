package basicCoding;

public class MyClass_2 {
	/*
	 * static int i;
	 * 
	 * public static void initialize1() {
	 * 
	 * i=22;
	 * 
	 * }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * MyClass_2.initialize1(); System.out.println(i);
	 * 
	 * 
	 * }
	 */

	////////////////////////////////////////////////////////////

	static final int i = 20; // value never change due to final variable..

	public static void main(String[] args) {

		System.out.println(i);
		System.out.println(MyConstant.MY_VARIABLE); // you can directly access the static variable in different class..

	}
	
	public static void initialize22() {
		
		System.out.println("Initialize method");
		
		
	}

   ////////////////////////////////////////////////////////////////////////////
	
	
}
