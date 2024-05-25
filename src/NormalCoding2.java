
public class NormalCoding2 {
	
	
	
	
	

	// How to update local variable..
	public void updatedd() {
		
		int a=10;
		a=90;
		System.out.println(a);
		
	}
	

	public static void main(String[] args) {
		
		int x= 100; //also a local variable..
		
		NormalCoding2 normalCoading2=new NormalCoding2();
		normalCoading2.updatedd();
		x=200;
		System.out.println(x);
		// OR
		//System.out.println(x=200);
	
		
		
		
		

	}

}
