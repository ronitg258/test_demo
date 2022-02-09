package io.sevenx.employeemanagement.ui;
import java.util.List;

import io.sevenx.employeemanagement.data.Employee;

public class EmployeeDisplay {
	public static void printEmployeeInfo(List<Employee> employee) {
		for (Employee e: employee) {
			System.out.println("Id: "+e.getId());
			System.out.println("First Name: "+e.getFirstName());
			System.out.println("Last Name: "+e.getLastName());
			System.out.println("Category: "+e.getCategory());
			System.out.println("Bonus: "+e.getBonus());
			System.out.println();
		}
	}
}
