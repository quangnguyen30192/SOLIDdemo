package ocp.bad;

public class AreaCalculator {

	/**
	 * Calculate the sum of all shape area's
	 */
	public double calculateArea(Object[] shapes) {
		double area = 0;
		for (Object shape : shapes) {
			if (shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) shape;
				area += (rectangle.getSideA() * rectangle.getSideB());

			} else if (shape instanceof Triangle) {
				Triangle triangle = (Triangle) shape;
				double halfPerimeter = (triangle.getFirstSide() + triangle.getSecondSide() + triangle.getThirdSide()) / 2;
				area += Math.sqrt(halfPerimeter
						* (halfPerimeter - triangle.getFirstSide())
						* (halfPerimeter - triangle.getSecondSide()))
						* (halfPerimeter - triangle.getThirdSide());
			} else if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				area += (circle.getRadius() * circle.getRadius() * Math.PI);
			} else if (shape instanceof Circle) {
				Square sa = new Square();
				// âdsdsd
			}
		}

		return area;
	}
}
