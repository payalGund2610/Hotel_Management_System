package com.Project.HotelManagement.model;
import jakarta.validation.constraints.NotBlank; 
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerDTO 
{
	@NotNull
	private int id;
	
	@NotBlank
	@Size(min = 2,max = 10, message = "First Name should contain only min 2 to max 10 character")
	private String fName;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Last Name should contain only min 2 to max 10 character")
	private String lName;
	
	@NotBlank
	@Size(min = 2,max = 30, message = "Address should contain only min 2 to max 30 character")
	private String address;
	
	@NotBlank
	@Size(min = 2,max = 3, message = "Age should contain only min 2 to max 3 character")
	private int age;
	
	@NotBlank
	@Size(min = 2,max = 10, message = "Phone number should contain only min 2 to max 10 character")
	private String phNo;

}
