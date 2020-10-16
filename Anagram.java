package projects07;

import java.util.Scanner;

public class Anagram {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  String message1 = sc.nextLine(); //ab2! ba
  String message2 = sc.nextLine(); //baba123
  sc.close();
 
  boolean isItAnagram = true;
  String copyMessage2 = message2; // ако се намери чар от м1 в м2, той се трие
  int lengthMessage1 = message1.length();
 
  for (int i = 0; i < lengthMessage1; i++) {
   char charInMessage1 = message1.charAt(i); //a
    if(charInMessage1 >= 'a' && charInMessage1 <= 'z' || charInMessage1 >= 'A' && charInMessage1 <= 'Z') {
  int positionInMessage2  = copyMessage2.indexOf(charInMessage1); // index of ще ни върне -1, ако не се съдържа
    if (positionInMessage2 == -1) {
  isItAnagram = false;
    break;
  }else {
       copyMessage2 = copyMessage2.substring(0, positionInMessage2) + copyMessage2.substring(positionInMessage2 + 1); // границата вдясно не се включва
 //System.out.println(copyMessage2);
   }
  }
 }
   if(isItAnagram) {
     int charsLeftMessage2 = copyMessage2.length();
 
 for(int i = 0 ; i< charsLeftMessage2; i++) {
    char currentChar = copyMessage2.charAt(i);
  if (currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z' ) {
  isItAnagram = false;
  break;
 }
 }
 }
 System.out.println(isItAnagram ? "is an anagram" : "is not an anagram"); // тернарен оператор
 }

}