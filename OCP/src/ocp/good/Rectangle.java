package ocp.good;

public class Rectangle implements Shape {
	
	protected double sideA;
	private double sideB;
	
	public double getSideA() {
		return sideA;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	@Override
	public double getArea() {
		return this.sideA * this.sideB;
	}
}