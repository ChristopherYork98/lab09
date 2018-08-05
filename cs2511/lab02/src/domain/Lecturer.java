package domain;

import java.time.LocalDate;

public class Lecturer extends Staff {

	String school;
	String academicLevel;
	
	
	public Lecturer(String firstName, String lastName, float newSalary, LocalDate newHireDate, LocalDate newEndDate, String newSchool, String newAcademicLevel) {
		super(firstName, lastName, newSalary, newHireDate, newEndDate);
		this.school = newSchool;
		this.academicLevel = newAcademicLevel;
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
		return "Staff Id = " + this.staffId + "\n" + "Name = " + this.name + "\n" + "Salary = " + this.salary + "\n" + "School = " + this.school + "\n" + "Academic Level = " + level + "\n";
	}
}
