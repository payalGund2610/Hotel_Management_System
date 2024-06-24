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

import com.Project.HotelManagement.entities.Room;
import com.Project.HotelManagement.model.RoomDTO;
import com.Project.HotelManagement.service.RoomService;
import com.Project.HotelManagement.utitity.RoomConverter;



@RestController
@RequestMapping("/anudip")
public class RoomController 
{
	// It is use for automatic dependency injection.
	// This means that Spring will automatically inject the required dependencies
	// into a bean,without the need for manual configuration
	@Autowired
	RoomService roomService;
	@Autowired
	RoomConverter converter;
	
	// It is to send the data in database or save information
	@PostMapping("/anudip/createRoom")
	ResponseEntity<RoomDTO> createRoom(@RequestBody RoomDTO roomDto )
	{
		final Room room=converter.convertToRoomEntity(roomDto);
		return new ResponseEntity<RoomDTO>(roomService.createRoom(room),HttpStatus.CREATED);
	}
	
	// Get All room Information
	@GetMapping("/getAllRoom")
	List<RoomDTO> getAllRoom()
	{
		return roomService.getAllRoom();		
	}
	
	// Get single Room Information
	@GetMapping("/getRoomById/{id}")
	RoomDTO getRoomById(@PathVariable("id") int id)
	{
		return roomService.getRoomById(id);
	}
	
	// Delete single Room Information
	@DeleteMapping("/deleteRoomrById/{id}")
	String deleteRoomById(@PathVariable("id") int id)
	{
		return roomService.deleteRoomById(id);
	}
	
	// Update record of single Room Information
	@PutMapping("/updateRoom/{id}")
	RoomDTO updateRoom(@PathVariable("id") int id,@RequestBody Room room)
	{
		return roomService.updateRoom(id, room);
		
	}
}