package domain;
import java.text.NumberFormat;
import java.time.LocalDate;
/*
 * @author Aarthi
 * A class to store details about staff
 */
public class Staff {
	
	String name;
	float salary;
	LocalDate hireDate;
	LocalDate endDate;
	int staffId; 
	static int staffNum = 0;

	public Staff(String firstName, String lastName, float newSalary, LocalDate newHireDate, LocalDate newEndDate) {
		this.name = firstName + lastName;
		this.salary = newSalary;
		this.hireDate = newHireDate;
		this.endDate = newEndDate;
		staffNum++;
		this.staffId = staffNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public LocalDate getHireDate() {
		return this.hireDate;
	}
	
	public LocalDate getEndDate() {
		return this.endDate;
	}
	
	public int getStaffId() {
		return this.staffId;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setEndDate(LocalDate newEndDate) {
		this.endDate = newEndDate;
	}
	
	public int getStaffCount() {
		return staffNum;
	}
	
	public void raiseSalary(float percentage) {
		if(percentage <= 0) {
			System.out.println("Input a value Greater-than 0");
			return;
		} else {
			salary = salary + salary*percentage;
			return;
		}
	}
	
	public String toString() {
		return "Staff Id = " + this.staffId + "\n" + "Name = " + this.name + "\n" + "Salary = " + this.salary + "\n";
	}
}
