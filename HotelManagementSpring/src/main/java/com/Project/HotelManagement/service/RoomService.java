package com.Project.HotelManagement.service;

import java.util.List;

import com.Project.HotelManagement.entities.*;
import com.Project.HotelManagement.model.*;

public interface RoomService 
{
	RoomDTO createRoom(Room room);
	List<RoomDTO> getAllRoom();
	RoomDTO getRoomById(int id);
	String deleteRoomById(int id);
	RoomDTO updateRoom(int id,Room room);
}
