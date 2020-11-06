package objectsAndClasses10;

public class CircleTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Circle10 c1 = new Circle10();
			System.out.println("Area of c1: " + c1.getArea() + " Perimeter of c1: " + c1.getPerimeter());
			
			Circle10 c2 = new Circle10(5.8);
			System.out.println("Area of c2: " + c2.getArea() + " Perimeter of c2: " + c2.getPerimeter());
			
			c1.setRadius(10);
			System.out.println("Area of c1: " + c1.getArea() + " Perimeter of c1: " + c1.getPerimeter());
			
	}

}
