package projects08;

import java.util.Scanner;

public class TenElements2 {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 Scanner in = new Scanner(System.in);
 final int size = 10;
 char[] array = new char[size];
 for(int i = 0; i<size; i++) {
 System.out.println("Enter a character");
 array[i] = in.next().charAt(0);
 }
 char last = array[0];
 for(int i = 0; i<size-1; i++) {
 array[i] = array[i+1];
 System.out.print(array[i] + " ");
 }
 array[size-1] = last;
 System.out.print(array[size-1]);
 
 
 
 
 in.close();
 }

}
