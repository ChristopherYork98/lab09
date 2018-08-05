package test;

import java.time.LocalDate;
import java.time.Month;
import lab02.domain.Staff;

public class StaffTest {
	public String printStaffDetails(domain.Staff aStaff) {
		return aStaff.toString();
	}
	
	public static void main(String[] args) {
		StaffTest test = new StaffTest();
		LocalDate hireDate = LocalDate.of(2018, Month.JANUARY, 10);
		LocalDate endDate = LocalDate.of(2020, Month.DECEMBER, 21);
		domain.Staff Jane = new Staff("Jane", "Mary", 40000, hireDate, endDate);
		System.out.println(test.printStaffDetails(Jane));
		LocalDate hireDate2 = LocalDate.of(2010, Month.JANUARY, 10);
		domain.Lecturer Andrew = new Lecturer("Andrew", "Scott", 110000, hireDate2, endDate, "Computer Science", "C");
		System.out.println(test.printStaffDetails(Andrew));		
		LocalDate hireDate3 = LocalDate.of(2017, Month.MARCH, 10);
		domain.Head Peat = new Lecturer("Peat", "Wilson", 110000, hireDate3, endDate, "Computer Science", "D", 500000);
		System.out.println(test.printStaffDetails(Peat));		
		Andrew.raiseSalary(0.10);
		System.out.println(test.printStaffDetails(Andrew));		
	}
}
