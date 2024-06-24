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
@Table(name="customer_details")
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id",length =20)
	private int id;
	
	@Column(name="fName",length =30)
	private String fName;
	
	@Column(name="lName",length =30)
	private String lName;
	
	@Column(name="add",length =50)
	private String address;
	
	@Column(name="age",length =5)
	private int age;
	
	@Column(name="phno",length =10)
	private String phNo;
}