package com.Database.HotelManagement.DAO;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Database.HotelManagement.entity.*;
import com.Database.HotelManagement.utility.*;

public class DAO 
{
	public void saveProduct(Hotel hotel)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			session.save(hotel);
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void deleteCustomer(String userName)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			Hotel hotel=session.get(Hotel.class, userName);
			session.delete(hotel);
			System.out.println("User name "+userName+" is deleted");
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	public void getCustByname(String userName)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			Hotel hotel=session.get(Hotel.class, userName);
			if(hotel!=null)
			{
				System.out.println(hotel);
				System.out.println("User name:"+hotel.getUserName());
				System.out.println("Email:"+hotel.getEmail());
				System.out.println("Password:"+hotel.getPassword());
				System.out.println("Phone No:"+hotel.getPhoneNo());
				System.out.println("Age:"+hotel.getAge());
				System.out.println("Country:"+hotel.getContry());
				System.out.println("State:"+hotel.getState());
				
				
			}
			else
			{
				System.out.println("Data not found of Name :"+userName);
			}
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			System.out.println("Error in fectching the data");
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
	
	
	
}
