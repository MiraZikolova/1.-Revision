package projects07;

import java.util.Scanner;

public class Pyramid {

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 System.out.println("Enter the number of lines of the pyramid");
 Scanner sc = new Scanner(System.in);
 int numberOfLines = sc.nextInt();
 sc.close();
 for (int i = 0; i < numberOfLines; i++) {
 for(int j = numberOfLines - i; j > 0; j--){ // i-индекса на реда, на който сме 0,1,2,3... 
 System.out.print(j + " ");
 }
 for(int j = 2; j <= numberOfLines-i; j++){
 System.out.print(j + " ");
 }
 System.out.print("\n");
 }
 }

}
