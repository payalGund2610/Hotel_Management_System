package com.Project.HotelManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.Project.HotelManagement.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	
}