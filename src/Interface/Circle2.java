package Interface;

public class Circle2 implements Shape2{
	
	String colours;
	double radius;
	
	
	
	Circle2(String colours, double radius){
		this.colours=colours;
		this.radius=radius;
		
	}

	@Override
	public String colours() {
		
		return colours;
	}

	@Override
	public double areas() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String information() {
		
		return "My colour is " +colours + " And my area is " +areas();
	}

}
