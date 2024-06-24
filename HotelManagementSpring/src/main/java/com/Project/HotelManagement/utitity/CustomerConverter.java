package com.Project.HotelManagement.utitity;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.Project.HotelManagement.entities.Customer;
import com.Project.HotelManagement.model.CustomerDTO;

@Component
public class CustomerConverter 
{
	//convert DTO to Entity
	public Customer convertToCustomerEntity(CustomerDTO customerDTO)
	{
		Customer customer=new Customer();
		if(customerDTO!=null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
		}
		return customer;
	}
	
	//Convert Entity to DTO
	public CustomerDTO convertToCustomerDTO(Customer  customer)
	{
		CustomerDTO customerDTO=new CustomerDTO();
		if(customer!=null)
		{
			BeanUtils.copyProperties(customer, customerDTO);
		}
		return customerDTO;
	}
	
}
