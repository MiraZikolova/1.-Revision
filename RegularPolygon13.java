package exercise13;

public class RegularPolygon13 {
	private int n;
	private double sideLength;
	private double x;
	private double y;
	RegularPolygon13(){
		setN(3);
		setSideLength(1);
		setX(0);
		setY(0);
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	RegularPolygon13(double sideLength){
		this.sideLength = sideLength;
		setX(0);
		setY(0);
	}
	RegularPolygon13(double sideLength, double x, double y){
		this.sideLength = sideLength;
		setX(x);
		setY(y);
	}
	public double getPerimeter(int n, double sideLength) {
		return (n * sideLength);
	}
	public double getArea(int n, double sideLength) {
		return ((n * sideLength * sideLength) / (4 * Math.tan(Math.PI / n)));
	}
}