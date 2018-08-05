package domain;

import java.time.LocalDate;

public class Head extends Lecturer {

	float budget;
	
	public Head(String firstName, String lastName, float newSalary, LocalDate newHireDate, LocalDate newEndDate, String newSchool, String newAcademicLevel, float newBudget) {
		super(firstName, lastName, newSalary, newHireDate, newEndDate, newSchool, newAcademicLevel);
		this.budget = newBudget;
	}
    
	public String toString() {
		String level = "none";
		if(this.academicLevel.equals("A")) {
			level = "Associate Lecturer";
		}
		if(this.academicLevel.equals("B")) {
			level = "Lecturer";
		}
		if(this.academicLevel.equals("C")) {
			level = "Senior Lecturer";
		}
		return "Staff Id = " + this.staffId + "\n" + "Name = " + this.name + "\n" + "Salary = " + this.salary + "\n" + "School = " + this.school + "\n" + "Academic Level = " + level + "\n" + "Budget = " + this.budget + "\n";
	}
}