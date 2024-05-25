
public class NormalCoding3 {

	// How to update global or Instance variable..
	
	int x=30;
	
	// if the global variable is static
	
     static int y=100;

	public static void main(String[] args) {
		
		NormalCoding3 nr=new NormalCoding3();
		nr.x=60;
		
		System.out.println(nr.x);
		
		y=200;
		System.out.println(y);
		
		

	}

}
