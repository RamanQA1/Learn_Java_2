package basicCoding;

public class BasicString {
	
	String stx="Hello World";
	
//	public void getString() {
//		
//		stx=stx.substring(6);
//		System.out.println(stx);
//	}
	
	public void compareString() {
		boolean flag =stx.equalsIgnoreCase("Hello World"); // for compare two string////
		System.out.println(flag);
	}

	public static void main(String[] args) {
		
		BasicString basicString = new BasicString();
//		basicString.getString();
		basicString.compareString();
		
		

	}

}
