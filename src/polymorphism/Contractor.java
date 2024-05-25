package polymorphism;

public class Contractor extends Employee{
	
	// Now let us create another class.And let us name it as contractor.And then here also we can override the same method.
	//Like this.And then here we will return the base.Plus, we will add, say, 10,000.Because the salary of my contractor is 20,000.
	//And let us extend it to the employee class.So this way we have different implementation for contractor and for full time employee.		
		




	
	@Override
	int salary() {
		
		return base +10000;
	}

}
