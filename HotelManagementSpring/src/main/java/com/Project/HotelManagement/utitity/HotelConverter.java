package com.Project.HotelManagement.utitity;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.Project.HotelManagement.entities.Hotel;
import com.Project.HotelManagement.model.HotelDTO;

@Component
public class HotelConverter 
{
	//convert DTO to Entity
	public Hotel convertToHotelEntity(HotelDTO hotelDTO)
	{
		Hotel hotel=new Hotel();
		if(hotelDTO!=null)
		{
			BeanUtils.copyProperties(hotelDTO, hotel);
		}
		return hotel;
	}
	
	//Convert Entity to DTO
	public HotelDTO convertToHotelDTO(Hotel  hotel)
	{
		HotelDTO hotelDTO=new HotelDTO();
		if(hotel!=null)
		{
			BeanUtils.copyProperties(hotel, hotelDTO);
		}
		return hotelDTO;
	}
	
}
