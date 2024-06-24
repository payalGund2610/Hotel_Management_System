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

import com.Project.HotelManagement.entities.Hotel;
import com.Project.HotelManagement.model.HotelDTO;
import com.Project.HotelManagement.service.HotelService;
import com.Project.HotelManagement.utitity.HotelConverter;


@RestController
@RequestMapping("/anudip")
public class HotelController 
{
	// It is use for automatic dependency injection.
	// This means that Spring will automatically inject the required dependencies
	// into a bean,without the need for manual configuration
	@Autowired
	HotelService hotelService;
	@Autowired
	HotelConverter converter;
	
	// It is to send the data in database or save information
	@PostMapping("/anudip/createHotel")
	ResponseEntity<HotelDTO> createHotel(@RequestBody HotelDTO hotelDto )
	{
		final Hotel hotel=converter.convertToHotelEntity(hotelDto);
		return new ResponseEntity<HotelDTO>(hotelService.createHotel(hotel),HttpStatus.CREATED);
	}
	
	// Get All Hotel Information
	@GetMapping("/getAllHotel")
	List<HotelDTO> getAllHotel()
	{
		return hotelService.getAllHotel();		
	}
	
	// Get single Hotel Information
	@GetMapping("/getHotelById/{id}")
	HotelDTO getHotelById(@PathVariable("id") int id)
	{
		return hotelService.getHotelById(id);
	}
	
	// Delete single Hotel Information
	@DeleteMapping("/deleteHotelById/{id}")
	String deleteHotelById(@PathVariable("id") int id)
	{
		return hotelService.deleteHotelById(id);
	}
	
	// Update record of single Hotel Information
	@PutMapping("/updateHotel/{id}")
	HotelDTO updateHotel(@PathVariable("id") int id,@RequestBody Hotel hotel)
	{
		return hotelService.updateHotel(id, hotel);
		
	}
}