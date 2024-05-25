package abstraction;

public class AbstactClass {

	public static void main(String[] args) {
		Circle circle=new Circle("Blue", 4);
		
		System.out.println(circle.info());
		
		Square square=new Square("Red", 10.0);
		System.out.println(square.info());
		

	}

}
