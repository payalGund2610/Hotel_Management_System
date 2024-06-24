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

import com.Project.HotelManagement.entities.Payment;
import com.Project.HotelManagement.model.PaymentDTO;
import com.Project.HotelManagement.service.PaymentService;
import com.Project.HotelManagement.utitity.PaymentConverter;

@RestController
@RequestMapping("/anudip")
public class PaymentController 
{
	// It is use for automatic dependency injection.
	// This means that Spring will automatically inject the required dependencies
	// into a bean,without the need for manual configuration
	@Autowired
	PaymentService paymentService;
	@Autowired
	PaymentConverter converter;
	
	// It is to send the data in database or save information
	@PostMapping("/anudip/makePayment")
	ResponseEntity<PaymentDTO> makePayment(@RequestBody PaymentDTO paymentDto )
	{
		final Payment payment=converter.convertToPaymentEntity(paymentDto);
		return new ResponseEntity<PaymentDTO>(paymentService.makePayment(payment),HttpStatus.CREATED);
	}
	
	// Get All payment Information
	@GetMapping("/getAllPayment")
	List<PaymentDTO> getAllPayment()
	{
		return paymentService.getAllPayment();		
	}
	
	// Get single payment Information
	@GetMapping("/getPaymentById/{id}")
	PaymentDTO getPaymentById(@PathVariable("No") int No)
	{
		return paymentService.getPaymentById(No);
	}
	
	// Delete single payment Information
	@DeleteMapping("/deletePaymentById/{No}")
	String deletePaymentrById(@PathVariable("No") int No)
	{
		return paymentService.deletePaymentById(No);
	}
	
	// Update record of single payment Information
	@PutMapping("/updatePayment/{No}")
	PaymentDTO updatePayment(@PathVariable("No") int No,@RequestBody Payment payment)
	{
		return paymentService.updatePayment(No, payment);
		
	}
}