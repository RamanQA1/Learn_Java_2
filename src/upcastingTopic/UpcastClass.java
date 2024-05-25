package upcastingTopic;

public class UpcastClass {

	public static void main(String[] args) {
		
		ParentAnimal p= new ChildAnimal(); // Upcasting
//		p.animal();
//		p.exist();
//		
		
		ChildAnimal c = (ChildAnimal) p; // Downcasting
		c.animal();
		c.childMethodnew();
		
		

	}

}
