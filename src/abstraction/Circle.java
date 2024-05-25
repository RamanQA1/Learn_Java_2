package abstraction;

public class Circle extends Shape {
	
	double radius;

	Circle(String colour, int radius) {
		super(colour);
		this.radius=radius;
		
		
		}
		
	

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	String info() {
		
		return " My colour is " +super.colour  +  " My Area is " +area();
	}

	
}
