package ocp.good;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(5.09);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setSideA(6.5);
		rectangle.setSideB(7);
		
		Rectangle square = new Square();
		square.setSideA(5);
		
		square.setSideB(7);
		
		Triangle triangle = new Triangle();
		triangle.setFirstSide(3);
		triangle.setSecondSide(4);
		triangle.setThirdSide(5);
		
		Shape[] shapes = new Shape[]{circle, rectangle, triangle};
		AreaCalculator areaCalculator = new AreaCalculator();
		System.out.println("Total area is: " + areaCalculator.calculateArea(shapes));
	}
}
