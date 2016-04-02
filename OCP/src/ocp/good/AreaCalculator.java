package ocp.good;

public class AreaCalculator {
	
	/**
	 * Calculate the sum of all shape area's 
	 */
	public double calculateArea(Shape[] shapes) {
		double area = 0;
		for (Shape shape : shapes) {
			area += shape.getArea();
		}
		return area;
	}
}
