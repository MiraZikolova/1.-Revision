package objectsAndClasses10;

public class Circle10 {
	public double radius;
	
	public Circle10() {
		radius = 1; //default
	}
	
	public Circle10(double newRadius) {
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
}
