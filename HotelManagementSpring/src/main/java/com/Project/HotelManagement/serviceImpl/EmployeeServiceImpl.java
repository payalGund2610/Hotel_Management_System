package com.Project.HotelManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.HotelManagement.entities.Employee;
import com.Project.HotelManagement.model.EmployeeDTO;
import com.Project.HotelManagement.repository.EmployeeRepository;
import com.Project.HotelManagement.service.EmployeeService;
import com.Project.HotelManagement.utitity.EmployeeConverter;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	EmployeeConverter converter;
	
	@Override
	public EmployeeDTO createEmployee(Employee employee) 
	{
		//Save Data in database
		Employee emp=employeeRepository.save(employee);
		//Convert the employee entity into customer DTO and return the values
		return converter.convertToEmployeeDTO(emp);
	}
	
	@Override
	public List<EmployeeDTO> getAllEmployee() 
	{
		
		//Fetch all data from database and store in list of customer
		List<Employee> employee=employeeRepository.findAll();
		//Create Array list of employeeDTO class
		List<EmployeeDTO> dtos=new ArrayList<>();
		for(Employee e:employee)
		{
			dtos.add(converter.convertToEmployeeDTO(e));
		}
		return dtos;
	}
	
	@Override
	public EmployeeDTO getEmployeeById(int id) 
	{
		//Find and store the employee value
		Employee e=employeeRepository.findById(id).get();
		//Convert the customer into dto
		return converter.convertToEmployeeDTO(e);
	}
	@Override
	public String deleteEmployeeById(int id) 
	{
		employeeRepository.deleteById(id);
		return "Employee deleted";
	}
	
	@Override
	public EmployeeDTO updateEmployee(int id, Employee employee) 
	{
		Employee e1=employeeRepository.findById(id).get();
//		e1.setName(employee.getName());
//		e1.setPhNo(employee.getPhNo());
//		e1.setAddress(employee.getAddress());
		Employee emp=employeeRepository.save(e1);
		return converter.convertToEmployeeDTO(emp);
	}
}