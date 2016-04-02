package ocp.good;

public class Triangle implements Shape {
	
	private double firstSide;
	private double secondSide;
	private double thirdSide;
	
	public double getFirstSide() {
		return firstSide;
	}
	public void setFirstSide(double firstSide) {
		this.firstSide = firstSide;
	}
	public double getSecondSide() {
		return secondSide;
	}
	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}
	public double getThirdSide() {
		return thirdSide;
	}
	public void setThirdSide(double thirdSide) {
		this.thirdSide = thirdSide;
	}
	
	@Override
	public double getArea() {
		double halfPerimeter = (this.firstSide + this.secondSide + this.thirdSide)/2;
		return Math.sqrt(halfPerimeter
				* (halfPerimeter - this.firstSide)
				* (halfPerimeter - this.secondSide)
				* (halfPerimeter - this.thirdSide));
	}
}