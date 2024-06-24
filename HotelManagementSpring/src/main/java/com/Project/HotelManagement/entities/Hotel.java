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
@Table(name="hotel_details")
public class Hotel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id",length =20)
	private int id;
	
	@Column(name="location",length =50)
	private String location;
	
	@Column(name="name",length =10)
	private String name;
}