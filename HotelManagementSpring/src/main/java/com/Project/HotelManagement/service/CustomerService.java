package com.Project.HotelManagement.service;

import java.util.List;

import com.Project.HotelManagement.entities.Customer;
import com.Project.HotelManagement.model.CustomerDTO;

public interface CustomerService 
{
	CustomerDTO createCustomer(Customer customer);
	List<CustomerDTO> getAllCustomer();
	CustomerDTO getCustomerById(int id);
	String deleteCustomerById(int id);
	CustomerDTO updateCustomer(int id,Customer customer);
}
