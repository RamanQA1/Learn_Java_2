package inheritanceConcept;

public class MyChildClass extends MyParentClass {
	 
	public MyChildClass(String constuctorss){
		
		super(constuctorss);// different way
		//super("Constructor String of Parent Class"); //Must be the First Statement of Constructor..
		System.out.println("Child class constructor");

		
	}
	
	public void childClassMethod() {
		
		System.out.println("Child Class Method");
	}

}
