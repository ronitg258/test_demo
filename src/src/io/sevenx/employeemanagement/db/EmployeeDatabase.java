package io.sevenx.employeemanagement.db;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import io.sevenx.employeemanagement.data.Employee;

public class EmployeeDatabase {
	public static void putInDatabase(List<Employee> employeeList) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");  
			Statement stmt=con.createStatement();
			ArrayList <Integer>arr;
			for (Employee e: employeeList) {
				ResultSet rst = stmt.executeQuery("select * from employee");
				arr = new ArrayList<Integer>();
				while (rst.next()) {
					arr.add(rst.getInt(1));
				}
				if(arr.contains(e.getId())) {
					int cnt = stmt.executeUpdate("update employee set firstName = '"+ e.getFirstName() +"', lastName = '"+ e.getLastName() +"', category = '"+ e.getCategory() +"', bonus = "+ e.getBonus() +" where id = "+ e.getId() +"");
					if (cnt == 1)
						System.out.println("Record updated");
					else
						System.out.println("Record not updated");
				}
				else {
					int cnt = stmt.executeUpdate("insert into employee values ("+ e.getId() +", '"+ e.getFirstName() +"', '"+ e.getLastName() +"', '"+ e.getCategory() +"', "+ e.getBonus() +" )");
					if (cnt == 1)
						System.out.println("Record inserted");
					else
						System.out.println("Record not inserted");
				}
			}
			System.out.println();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static List<Employee> getFromDatabase(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");  
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee;");
			List<Employee> employee = new ArrayList<Employee>();
			
			while(rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setFirstName(rs.getString(2));
				e.setLastName(rs.getString(3));
				e.setCategory(rs.getString(4));
				e.setBonus(rs.getInt(5));employee.add(e);
			}
			return employee;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
