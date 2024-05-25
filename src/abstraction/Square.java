package abstraction;

public class Square extends Shape {
	
	double side;

	Square(String colour, double side) {
		super(colour);
		this.side=side;
		
	}

	@Override
	double area() {
		
		return Math.pow(side, 2);
	}

	@Override
	String info() {
	
		return " My Colour is " + super.colour + " And My area is " +area();
	}

}
