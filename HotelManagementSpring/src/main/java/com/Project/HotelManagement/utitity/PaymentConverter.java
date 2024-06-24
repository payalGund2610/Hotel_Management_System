package com.Project.HotelManagement.utitity;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.Project.HotelManagement.entities.Payment;
import com.Project.HotelManagement.model.PaymentDTO;



@Component
public class PaymentConverter 
{
	//convert DTO to Entity
	public Payment convertToPaymentEntity(PaymentDTO paymentDTO)
	{
		Payment payment=new Payment();
		if(paymentDTO!=null)
		{
			BeanUtils.copyProperties(paymentDTO, payment);
		}
		return payment;
	}
	
	//Convert Entity to DTO
	public PaymentDTO convertToPaymentDTO(Payment  payment)
	{
		PaymentDTO paymentDTO=new PaymentDTO();
		if(payment!=null)
		{
			BeanUtils.copyProperties(payment, paymentDTO);
		}
		return paymentDTO;
	}
	
}
