package com.Project.HotelManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoomDTO 
{
	@NotNull
	private int RoomNo;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Room type Name should contain only min 2 to max 20 character")
	private String RoomType;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Room Status should contain only min 2 to max 20 character")
	private String RoomStatus;
}
