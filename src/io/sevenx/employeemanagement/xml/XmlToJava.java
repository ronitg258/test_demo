package io.sevenx.employeemanagement.xml;
import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import io.sevenx.employeemanagement.data.Employee;
import io.sevenx.employeemanagement.data.Employees;

public class XmlToJava {
	public static List<Employee> parsing(String filePath) {
		File xmlFile = new File(filePath);
		JAXBContext jaxbContext;
		Unmarshaller jaxbUnmarshaller;
		try {			
			jaxbContext = JAXBContext.newInstance(Employees.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Employees employee = (Employees) jaxbUnmarshaller.unmarshal(xmlFile);
			List<Employee> employees = employee.getEmployees();
			return employees;
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
}