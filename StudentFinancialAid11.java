package objectsInMemory11;

import java.util.Scanner;

public class StudentFinancialAid11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student11[] students = new Student11[5]; // masiv ot referencii kum obekti
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			String name = sc.nextLine();
			double grade= sc.nextDouble();
			sc.nextLine();
			students[i] = new Student11(name,grade);
		}
		displayStudentsEligible(students);
	}
public static void displayStudentsEligible(Student11 students[]) {
	for(Student11 s : students) {
		if(isStudentEligible(s)) {
			System.out.println(s.name);
		}
	}
}
public static boolean isStudentEligible(Student11 student) {
	return student.grade > 5.50;
}
}
