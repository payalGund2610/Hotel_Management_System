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
@Table(name="employee_details")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id",length =20)
	private int id;
	
	@Column(name="Name",length =30)
	private String Name;
	
	@Column(name="add",length =50)
	private String address;
	
	@Column(name="JobDesc",length =30)
	private String JobDesc;
	
	@Column(name="phno",length =10)
	private String phNo;
}