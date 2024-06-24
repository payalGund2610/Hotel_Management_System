package com.Project.HotelManagement.utitity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.Project.HotelManagement.entities.Room;
import com.Project.HotelManagement.model.RoomDTO;

@Component
public class RoomConverter
{
	//convert DTO to Entity
		public Room convertToRoomEntity(RoomDTO roomDTO)
		{
			Room room=new Room();
			if(roomDTO!=null)
			{
				BeanUtils.copyProperties(roomDTO, room);
			}
			return room;
		}
		
		//Convert Entity to DTO
		public RoomDTO convertToRoomDTO(Room room)
		{
			RoomDTO roomDTO=new RoomDTO();
			if(room!=null)
			{
				BeanUtils.copyProperties(room, roomDTO);
			}
			return roomDTO;
		}
}
