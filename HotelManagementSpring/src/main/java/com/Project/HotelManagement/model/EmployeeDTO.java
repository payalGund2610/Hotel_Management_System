package com.Project.HotelManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO 
{
	@NotNull
	private int id;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Name should contain only min 2 to max 20 character")
	private String Name;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "The address should contain only min 2 to max 20 character")
	private String address;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Job description should contain only min 2 to max 20 character")
	private String JobDesc;
	
	@NotBlank
	@Size(min = 2,max = 10, message = "The phone number should contain only min 2 to max 10 character")
	private String phNo;

}
