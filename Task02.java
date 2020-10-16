package projects08;

import javax.swing.JOptionPane;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] value = new int [10];
		for(int i=0; i<10; i++){
			
			String input =(String)JOptionPane.showInputDialog(null,
					"Value?",
					null,
					2,
					null,
					null,
					"Type a number:");
			value[i] = Integer.parseInt(input);
		}
		int currentIndex = value.length, temporaryValue, randomIndex;
		
		while (0 !=currentIndex) {
			
			randomIndex = (int) Math.floor(Math.random()*currentIndex);
			currentIndex-=1;
			
			temporaryValue = value[currentIndex];
			value[currentIndex] = value[randomIndex];
			value[randomIndex] = temporaryValue;
		}
		for(int smth : value){
			System.out.println(smth);
		}

	}

}
