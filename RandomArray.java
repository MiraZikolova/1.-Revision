package projects08;

import java.util.Random;

public class RandomArray {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 char[] array = new char[20];
 Random rand = new Random();
 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String fullalphabet = alphabet + alphabet.toLowerCase() + "1234567890";
     for(int i = 0; i<20; i++) {
      array[i] = fullalphabet.charAt(rand.nextInt(62));
      System.out.print(array[i] + " ");
     }
 }

}
