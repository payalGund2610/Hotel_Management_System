package com.Project.HotelManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HotelDTO 
{
	@NotNull
	private int id;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Location should contain only min 2 to max 20 character")
	private String location;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Name should contain only min 2 to max 20 character")
	private String name;

}
