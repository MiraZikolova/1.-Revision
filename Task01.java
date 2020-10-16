package projects08;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		
		int [] array = new int[20];
		Random rand = new Random();
		for(int i=0; i<20; i++){
			array[i] = rand.nextInt();
		}
		for(int thing : array) {
			System.out.println(thing);
		}
	}
}
