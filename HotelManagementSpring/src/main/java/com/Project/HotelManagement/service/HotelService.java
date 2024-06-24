package com.Project.HotelManagement.service;

import java.util.List;

import com.Project.HotelManagement.entities.Hotel;
import com.Project.HotelManagement.model.HotelDTO;

public interface HotelService 
{
	HotelDTO createHotel(Hotel hotel);
	List<HotelDTO> getAllHotel();
	HotelDTO getHotelById(int id);
	String deleteHotelById(int id);
	HotelDTO updateHotel(int id,Hotel hotel);
}
