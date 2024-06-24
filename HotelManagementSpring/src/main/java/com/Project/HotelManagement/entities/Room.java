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
@Table(name="room_details")
public class Room 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="roomNo",length =5)
	private int RoomNo;
	
	@Column(name="roomType",length =20)
	private String RoomType;
	
	@Column(name="roomStatus",length =20)
	private String RoomStatus;
}