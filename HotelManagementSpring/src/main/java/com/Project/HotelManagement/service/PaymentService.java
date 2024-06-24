package com.Project.HotelManagement.service;

import java.util.List;

import com.Project.HotelManagement.entities.*;
import com.Project.HotelManagement.model.*;

public interface PaymentService 
{
	PaymentDTO makePayment(Payment payment);
	List<PaymentDTO> getAllPayment();
	PaymentDTO getPaymentById(int No);
	String deletePaymentById(int No);
	PaymentDTO updatePayment(int No,Payment payment);
}
