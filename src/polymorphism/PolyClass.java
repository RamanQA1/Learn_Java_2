package polymorphism;

public class PolyClass {
	
	public static void main(String[] args) {
		
		// So in this case, the type of our object is a full time.
		   //  Right.And the reference variable is the employee object.
			
			Employee e=new FullTime();
			System.out.println("Full time Employee salary : " +e.salary());
			
			e= new Contractor();
			System.out.println("Contractor Employee salary : " +e.salary());
			
			// So what happens is Java looks for the type of the object to determine which method to call to at runtime,

//and it doesn't really look at the reference.Okay, so in this case, the reference can remain same.

//What matters is the type of the object that we are referring to.And based on that, the method will be called the overridden method will be called.
			
		
			System.out.println(FullTime.designation()); // static method directly access through class name...
			
	}
	
	
   

}
