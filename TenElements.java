package projects08;

import java.util.Random;
import java.util.Scanner;

public class TenElements {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 Scanner in = new Scanner(System.in);
 Random rand = new Random();
 char[] array = new char[10];
 for(int i = 0; i<10; i++) {
 System.out.println("Enter a character");
 array[i] = in.next().charAt(0);
 }
 for(int i = 0; i<10; i++) {
 int r = rand.nextInt(10);
 char swap = array[i];
 array[i] = array[r];
 array[r] = swap;
 }
 for(int i = 0; i<10; i++) {
 System.out.print(array[i] + " ");
 }
 in.close();
 }

}