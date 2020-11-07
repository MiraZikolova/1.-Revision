package modifiers12;

public class PrivateCircle12 {
	private double radius;
	
	public PrivateCircle12() {
		radius = 1; //default
	}
	
	public PrivateCircle12(double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.PI*radius*2;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
}
