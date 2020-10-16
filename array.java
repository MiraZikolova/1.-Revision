package projects08;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arraySize= 5;
		int[] array = new int[arraySize];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<arraySize; i++){
			System.out.println("Input an element on position " + i);
			array[i] = sc.nextInt();
		}
		double sum = 0, average = 0;
		int evenIndiciesNumber = 0;
		for(int i = 0; i < arraySize; i++){
			if(i%2 == 0){
				evenIndiciesNumber++;
				sum +=array[i];
			}
		}
		average = sum/evenIndiciesNumber;
		System.out.println("Average of all elements on position with an even index is " + average);
	}

}
