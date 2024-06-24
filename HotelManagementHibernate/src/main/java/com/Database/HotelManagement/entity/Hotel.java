package com.Database.HotelManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyHotel")
public class Hotel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//Generate the columns in database
	@Column(name = "UserName",length = 20)
	private String userName;
	
	@Column(name = "Email",length = 30)
	private String email;
	
	@Column(name = "Password",length = 8)
	private String password;
	
	@Column(name = "Phone_No",length = 10)
	private String phoneNo;
	
	@Column(name = "Age",length = 3)
	private int age;
	
	@Column(name = "Contry",length = 10)
	private String contry;
	
	@Column(name = "State",length = 10)
	private String state;
	public Hotel() 
	{
		super();
		
	}

	public Hotel(String userName, String email, String password, String phoneNo, int age, String contry,String state) 
	{
		super();
		this.userName = userName;
		this.email=email;
		this.password=password;
		this.phoneNo=phoneNo;
		this.age=age;
		this.contry=contry;
		this.state=state;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}

