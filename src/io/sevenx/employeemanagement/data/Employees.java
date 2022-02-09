package io.sevenx.employeemanagement.data;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Employees {
	@XmlElement(name = "employee")
	private List<Employee> employees = null;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployee(List<Employee> employee) {
		this.employees = employee;
	}
}