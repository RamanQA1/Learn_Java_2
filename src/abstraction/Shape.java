package abstraction;

public abstract class Shape {
	
	String colour;
	
	Shape(String colour){
		this.colour=colour;
	}
	
	abstract double area();
	abstract String info();
	
	public String getColour() {
		return colour;
	}

}
