package io.sevenx.employeemanagement;

import java.util.List;

import io.sevenx.employeemanagement.data.Employee;
import io.sevenx.employeemanagement.db.EmployeeDatabase;
import io.sevenx.employeemanagement.ui.EmployeeDisplay;
import io.sevenx.employeemanagement.xml.XmlToJava;

public class EmployeeManagement {
	public static void main(String[] args) {
		String filePath = "src/io/sevenx/employeemanagement/xml/Employee.xml";
		List<Employee> employee = XmlToJava.parsing(filePath);
		EmployeeDatabase.putInDatabase(employee);
		List<Employee> employeeList = EmployeeDatabase.getFromDatabase();		
		EmployeeDisplay.printEmployeeInfo(employeeList);
	}
}