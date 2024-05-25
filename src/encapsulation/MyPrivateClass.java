package encapsulation;

public class MyPrivateClass {
	
	private String str = "My String";
	
	private void myNewMethod() {
		
		System.out.println("Encapsulation Method");
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
