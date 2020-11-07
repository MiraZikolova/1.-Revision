package modifiers12;

import java.util.Scanner;

public class PrivateStudentFinancialAid12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateStudent12[] students = new PrivateStudent12[5]; // masiv ot referencii kum obekti
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			String name = sc.nextLine();
			double grade= sc.nextDouble();
			sc.nextLine();
			students[i] = new PrivateStudent12(name,grade);
		}
		displayStudentsEligible(students);
	}
public static void displayStudentsEligible(PrivateStudent12 students[]) {
	for(PrivateStudent12 s : students) {
		if(isStudentEligible(s)) {
			System.out.println(s.getName());
		}
	}
}
public static boolean isStudentEligible(PrivateStudent12 student) {
	return student.getGrade() > 5.50;
}

}
