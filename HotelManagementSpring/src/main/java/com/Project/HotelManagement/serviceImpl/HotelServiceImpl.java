package com.Project.HotelManagement.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.HotelManagement.entities.Hotel;
import com.Project.HotelManagement.model.HotelDTO;
import com.Project.HotelManagement.repository.HotelRepository;
import com.Project.HotelManagement.service.HotelService;
import com.Project.HotelManagement.utitity.HotelConverter;

@Service
public class HotelServiceImpl implements HotelService
{

	@Autowired
	HotelRepository hotelRepository;
	@Autowired
	HotelConverter converter;
	
	@Override
	public HotelDTO createHotel(Hotel hotel) 
	{
		//Save Data in database
		Hotel hst=hotelRepository.save(hotel);
		//Convert the Hotel entity into hotel DTO and return the values
		return converter.convertToHotelDTO(hst);
	}
	
	@Override
	public List<HotelDTO> getAllHotel() 
	{
		
		//Fetch all data from database and store in list of hotel
		List<Hotel> hotel=hotelRepository.findAll();
		//Create Array list of HotelDTO class
		List<HotelDTO> dtos=new ArrayList<>();
		for(Hotel h:hotel)
		{
			dtos.add(converter.convertToHotelDTO(h));
		}
		return dtos;
	}
	
	@Override
	public HotelDTO getHotelById(int id) 
	{
		//Find and store the hotel value
		Hotel h=hotelRepository.findById(id).get();
		//Convert the hotel into dto
		return converter.convertToHotelDTO(h);
	}
	@Override
	public String deleteHotelById(int id) 
	{
		hotelRepository.deleteById(id);
		return "Hotel deleted";
	}
	
	@Override
	public HotelDTO updateHotel(int id, Hotel hotel) 
	{
		Hotel h1=hotelRepository.findById(id).get();
//		c1.setName(hotel.getName());
//		c1.setPhNo(hotel.getPhNo());
//		c1.setAddress(hotel.getAddress());
		Hotel hst=hotelRepository.save(h1);
		return converter.convertToHotelDTO(hst);
	}
}