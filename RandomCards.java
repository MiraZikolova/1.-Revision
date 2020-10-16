package projects08;

import java.util.Random;

public class RandomCards {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 String[] CardType = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
 String[] CardSuit = {" of spades", " of diamonds", " of hearts", " of clubs"};
 Random rand = new Random();
 String[] Card = new String[4];
 for(int i = 0; i < 1; i++){
 String current;
 boolean isAvailable = true;
 do{
 int CT = 13; //rand.nextInt(13);
 int CS = rand.nextInt(4);
 current = CardType[CT] + CardSuit[CS];
 for(int j = 0; j < i; j++){
  if(Card[j].equals(current)){
  isAvailable = false;
  }
 }
 }while(!isAvailable);
 Card[i] = current;
 
}
 for(int i = 0; i < 1; i++){
 System.out.println(Card[i]);
 }
 }

}
