package polymorphism;

public class FullTime extends Employee{
	
	
	//And now here let us create the same salary method.So I will type int.Salary.And then return base.Let us now change the base salary of the employee from 10,000 to let us say.30,000.Right.So I'm going to add 20,000.
//Because the salary of my full time employee is 30,000.And now let us use the at the rate override annotation like this.So with this, what we did is that we basically overridden the salary method, which is.Defined in the superclass.And we implemented in a different way.So basically we added 20,000 to the best salary.


	@Override
	int salary() {
		return base +20000;
		
	}
	
	static String designation() {
		
		return "Fulltime Employee";
	}

}
