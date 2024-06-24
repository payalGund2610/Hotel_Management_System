package com.Project.HotelManagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//In this annotation Getter setter and toString method is present
@Data

//In this annotation All argument constructor is present
@AllArgsConstructor

//In this annotation no argument constructor is present
@NoArgsConstructor

@Entity
@Table(name="payment_details")
public class Payment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="p_No",length =15)
	private int PayNo;
	
	@Column(name="p_Method",length =20)
	private String PayMethod;
	
	@Column(name="p_Date",length =20)
	private String PayDate;
	
	@Column(name="p_Amt",length =10)
	private long PayAmt;
}