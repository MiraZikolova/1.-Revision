package modifiers12;

import modifiers12.PrivateCircle12;

public class PrivateCircleTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			PrivateCircle12 c1 = new PrivateCircle12();
			System.out.println("Area of c1: " + c1.getArea() + " Perimeter of c1: " + c1.getPerimeter());
			
			PrivateCircle12 c2 = new PrivateCircle12(5.8);
			System.out.println("Area of c2: " + c2.getArea() + " Perimeter of c2: " + c2.getPerimeter());
			
			c1.setRadius(10);
			System.out.println("Area of c1: " + c1.getArea() + " Perimeter of c1: " + c1.getPerimeter());
			
	}

}