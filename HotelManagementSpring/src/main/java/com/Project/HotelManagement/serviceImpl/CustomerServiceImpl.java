package com.Project.HotelManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.HotelManagement.entities.Customer;
import com.Project.HotelManagement.model.CustomerDTO;
import com.Project.HotelManagement.repository.CustomerRepository;
import com.Project.HotelManagement.service.CustomerService;
import com.Project.HotelManagement.utitity.CustomerConverter;

@Service
public class CustomerServiceImpl implements CustomerService
{

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CustomerConverter converter;
	
	@Override
	public CustomerDTO createCustomer(Customer customer) 
	{
		//Save Data in database
		Customer cust=customerRepository.save(customer);
		//Convert the customer entity into customer DTO and return the values
		return converter.convertToCustomerDTO(cust);
	}
	
	@Override
	public List<CustomerDTO> getAllCustomer() 
	{
		
		//Fetch all data from database and store in list of customer
		List<Customer> customer=customerRepository.findAll();
		//Create Array list of CustomerDTO class
		List<CustomerDTO> dtos=new ArrayList<>();
		for(Customer c:customer)
		{
			dtos.add(converter.convertToCustomerDTO(c));
		}
		return dtos;
	}
	
	@Override
	public CustomerDTO getCustomerById(int id) 
	{
		//Find and store the customer value
		Customer c=customerRepository.findById(id).get();
		//Convert the customer into dto
		return converter.convertToCustomerDTO(c);
	}
	@Override
	public String deleteCustomerById(int id) 
	{
		customerRepository.deleteById(id);
		return "Customer deleted";
	}
	
	@Override
	public CustomerDTO updateCustomer(int id, Customer customer) 
	{
		Customer c1=customerRepository.findById(id).get();
//		c1.setName(customer.getName());
//		c1.setPhNo(customer.getPhNo());
//		c1.setAddress(customer.getAddress());
		Customer stud=customerRepository.save(c1);
		return converter.convertToCustomerDTO(stud);
	}
}