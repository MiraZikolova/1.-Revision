package projects06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MultiPlanetaryWeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter weight: ");
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter a planet of the Solar system: ");
		String planet = sc.nextLine();

		double weightOnADifferentPlanet = 0;
		switch (planet){
		case "Mercury" :
			weightOnADifferentPlanet = 0.38 * weight;
			break;
		case "Venus" :
			weightOnADifferentPlanet = 0.91 * weight;
			break;
		case "Mars" :
			weightOnADifferentPlanet = 0.38 * weight;
			break;
		case "Jupiter" :
			weightOnADifferentPlanet = 2.36 * weight;
			break;
		case "Saturn" :
			weightOnADifferentPlanet = 0.92 * weight;
			break;
		case "Uranus" :
			weightOnADifferentPlanet = 0.89 * weight;
			break;
		case "Neptune" :
			weightOnADifferentPlanet = 1.13 * weight;
			break;
 }
		System.out.println("Your weight on " + planet + " is " 
 + (int)(weightOnADifferentPlanet*100)/100.0 + " kg.");
 }
}