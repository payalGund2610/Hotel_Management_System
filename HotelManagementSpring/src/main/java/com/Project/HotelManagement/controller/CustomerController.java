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

import com.Project.HotelManagement.entities.Customer;
import com.Project.HotelManagement.model.CustomerDTO;
import com.Project.HotelManagement.service.CustomerService;
import com.Project.HotelManagement.utitity.*;

@RestController
@RequestMapping("/anudip")
public class CustomerController 
{
	// It is use for automatic dependency injection.
	// This means that Spring will automatically inject the required dependencies
	// into a bean,without the need for manual configuration
	@Autowired
	CustomerService customerService;
	@Autowired
	CustomerConverter converter;
	
	// It is to send the data in database or save information
	@PostMapping("/anudip/createCustomer")
	ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDto )
	{
		final Customer customer=converter.convertToCustomerEntity(customerDto);
		return new ResponseEntity<CustomerDTO>(customerService.createCustomer(customer),HttpStatus.CREATED);
	}
	
	// Get All Customer Information
	@GetMapping("/getAllCustomer")
	List<CustomerDTO> getAllCustomer()
	{
		return customerService.getAllCustomer();		
	}
	
	// Get single Customer Information
	@GetMapping("/getCustomerById/{id}")
	CustomerDTO getCustomerById(@PathVariable("id") int id)
	{
		return customerService.getCustomerById(id);
	}
	
	// Delete single Customer Information
	@DeleteMapping("/deleteCustomerById/{id}")
	String deleteCustomerById(@PathVariable("id") int id)
	{
		return customerService.deleteCustomerById(id);
	}
	
	// Update record of single Customer Information
	@PutMapping("/updateCustomer/{id}")
	CustomerDTO updateCustomer(@PathVariable("id") int id,@RequestBody Customer customer)
	{
		return customerService.updateCustomer(id, customer);
		
	}
}