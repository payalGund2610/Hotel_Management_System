package com.Project.HotelManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.HotelManagement.entities.Payment;
import com.Project.HotelManagement.model.PaymentDTO;
import com.Project.HotelManagement.repository.PaymentRepository;
import com.Project.HotelManagement.service.PaymentService;
import com.Project.HotelManagement.utitity.PaymentConverter;
 
@Service
public class PaymentServiceImpl implements PaymentService
{

	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	PaymentConverter converter;
	
	@Override
	public PaymentDTO makePayment(Payment payment) 
	{
		//Save Data in database
		Payment pay=paymentRepository.save(payment);
		//Convert the room entity into Payment DTO and return the values
		return converter.convertToPaymentDTO(pay);
	}
	
	@Override
	public List<PaymentDTO> getAllPayment() 
	{
		
		//Fetch all data from database and store in list of Payment
		List<Payment> payment=paymentRepository.findAll();
		//Create Array list of RoomDTO class
		List<PaymentDTO> dtos=new ArrayList<>();
		for(Payment p:payment)
		{
			dtos.add(converter.convertToPaymentDTO(p));
		}
		return dtos;
	}
	
	@Override
	public PaymentDTO getPaymentById(int no) 
	{
		//Find and store the Payment value
		Payment p=paymentRepository.findById(no).get();
		//Convert the Payment into dto
		return converter.convertToPaymentDTO(p);
	}
	@Override
	public String deletePaymentById(int no) 
	{
		paymentRepository.deleteById(no);
		return "Payment deleted";
	}
	
	@Override
	public PaymentDTO updatePayment(int no, Payment payment) 
	{
		Payment p1=paymentRepository.findById(no).get();
//		p1.setName(payment.getName());
//		p1.setPhNo(payment.getPhNo());
//		p1.setAddress(payment.getAddress());
		Payment pay=paymentRepository.save(p1);
		return converter.convertToPaymentDTO(pay);
	}
}