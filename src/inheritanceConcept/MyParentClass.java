package inheritanceConcept;

public class MyParentClass {
	
	String supperStr= "Super star string";
	
	public MyParentClass(String constructorStr) {
		System.out.println("parent class constructor");
		System.out.println(constructorStr);
		
	}
	
	public void superClassMethod() {
		System.out.println("Parent Class Method");
	}

}
