package com.Project.HotelManagement.service;

import java.util.List;

import com.Project.HotelManagement.entities.Employee;
import com.Project.HotelManagement.model.EmployeeDTO;

public interface EmployeeService 
{
	EmployeeDTO createEmployee(Employee employee);
	List<EmployeeDTO> getAllEmployee();
	EmployeeDTO getEmployeeById(int id);
	String deleteEmployeeById(int id);
	EmployeeDTO updateEmployee(int id,Employee employee);
}
