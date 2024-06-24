package com.Project.HotelManagement.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentDTO 
{
	@NotNull
	private int PayNo;
	
	@NotBlank
	@Size(min = 2,max = 20, message = "Payment method Name should contain only min 2 to max 20 character")
	private String PayMethod;
	
	@NotBlank
	@Size(min = 2,max = 10, message = "Payment date should contain only min 2 to max 10 character")
	private String PayDate;
	
	@NotBlank
	@Size(min = 2,max = 6, message = "Amount should contain only min 2 to max 6 character")
	private long PayAmt;
}
