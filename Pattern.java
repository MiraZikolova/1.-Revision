package projects07;
import java.util.Scanner;
public class Pattern{

 public static void main(String[] args) {
 // TODO Auto-generated method stub
 System.out.println("Enter the number of lines of the pyramid");
 Scanner sc = new Scanner(System.in);
 int numberOfLines = sc.nextInt();
 sc.close();
 for (int i = 0; i < numberOfLines; i++) {
 for(int j = numberOfLines; j < numberOfLines + i; j++){
 System.out.print(" ");
 }
 for(int j = 0; j < numberOfLines - i; j++){
 System.out.print("*");
 }
 System.out.print("\n");
 }
 }

}