package com.Project.HotelManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project.HotelManagement.entities.*;
import com.Project.HotelManagement.model.*;
import com.Project.HotelManagement.repository.*;
import com.Project.HotelManagement.service.*;
import com.Project.HotelManagement.utitity.*;

@Service
public class RoomServicesImpl implements RoomService
{

	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomConverter converter;
	
	@Override
	public RoomDTO createRoom(Room room) 
	{
		//Save Data in database
		Room rm=roomRepository.save(room);
		//Convert the room entity into room DTO and return the values
		return converter.convertToRoomDTO(rm);
	}
	
	@Override
	public List<RoomDTO> getAllRoom() 
	{
		
		//Fetch all data from database and store in list of room
		List<Room> room=roomRepository.findAll();
		//Create Array list of RoomDTO class
		List<RoomDTO> dtos=new ArrayList<>();
		for(Room r:room)
		{
			dtos.add(converter.convertToRoomDTO(r));
		}
		return dtos;
	}
	
	@Override
	public RoomDTO getRoomById(int no) 
	{
		//Find and store the customer value
		Room r=roomRepository.findById(no).get();
		//Convert the room into dto
		return converter.convertToRoomDTO(r);
	}
	@Override
	public String deleteRoomById(int no) 
	{
		roomRepository.deleteById(no);
		return "Room deleted";
	}
	
	@Override
	public RoomDTO updateRoom(int no, Room room) 
	{
		Room r1=roomRepository.findById(no).get();
//		c1.setName(room.getName());
//		c1.setPhNo(room.getPhNo());
//		c1.setAddress(room.getAddress());
		Room rm=roomRepository.save(r1);
		return converter.convertToRoomDTO(rm);
	}
}