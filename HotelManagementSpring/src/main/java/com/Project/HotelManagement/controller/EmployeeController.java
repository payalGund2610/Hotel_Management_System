package com.Project.HotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.HotelManagement.entities.Employee;
import com.Project.HotelManagement.model.EmployeeDTO;
import com.Project.HotelManagement.service.EmployeeService;
import com.Project.HotelManagement.utitity.EmployeeConverter;

@RestController
@RequestMapping("/anudip")
public class EmployeeController 
{
	// It is use for automatic dependency injection.
	// This means that Spring will automatically inject the required dependencies
	// into a bean,without the need for manual configuration
	@Autowired
	EmployeeService employeeService;
	@Autowired
	EmployeeConverter converter;
	
	// It is to send the data in database or save information
	@PostMapping("/anudip/createEmployee")
	ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDto )
	{
		final Employee employee=converter.convertToEmployeeEntity(employeeDto);
		return new ResponseEntity<EmployeeDTO>(employeeService.createEmployee(employee),HttpStatus.CREATED);
	}
	
	// Get All Employee Information
	@GetMapping("/getAllEmployee")
	List<EmployeeDTO> getAllEmployee()
	{
		return employeeService.getAllEmployee();		
	}
	
	// Get single Employee Information
	@GetMapping("/getEmployeeById/{id}")
	EmployeeDTO getEmployeeById(@PathVariable("id") int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	// Delete single Employee Information
	@DeleteMapping("/deleteEmployeeById/{id}")
	String deleteEmployeeById(@PathVariable("id") int id)
	{
		return employeeService.deleteEmployeeById(id);
	}
	
	// Update record of single Employee Information
	@PutMapping("/updateEmployee/{id}")
	EmployeeDTO updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
		
	}
}