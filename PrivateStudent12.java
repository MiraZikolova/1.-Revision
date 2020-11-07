package modifiers12;

public class PrivateStudent12 {
	private String name;
	private double grade;
	
	public PrivateStudent12() {
		
	}

	public PrivateStudent12(String name, double grade) {
		this.setName(name);
		this.setGrade(grade);
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}