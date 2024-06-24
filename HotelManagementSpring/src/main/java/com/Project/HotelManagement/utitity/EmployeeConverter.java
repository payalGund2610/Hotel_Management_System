package com.Project.HotelManagement.utitity;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.Project.HotelManagement.entities.Employee;
import com.Project.HotelManagement.model.EmployeeDTO;


@Component
public class EmployeeConverter 
{
	//convert DTO to Entity
	public Employee convertToEmployeeEntity(EmployeeDTO employeeDTO)
	{
		Employee employee=new Employee();
		if(employeeDTO!=null)
		{
			BeanUtils.copyProperties(employeeDTO, employee);
		}
		return employee;
	}
	
	//Convert Entity to DTO
	public EmployeeDTO convertToEmployeeDTO(Employee employee)
	{
		EmployeeDTO employeeDTO=new EmployeeDTO();
		if(employee!=null)
		{
			BeanUtils.copyProperties(employee, employeeDTO);
		}
		return employeeDTO;
	}
	
}
