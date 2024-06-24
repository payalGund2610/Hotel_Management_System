package com.Database.HotelManagement;

import java.util.Scanner;
import com.Database.HotelManagement.DAO.*;
import com.Database.HotelManagement.entity.*;

public class App 
{
	Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        
    	App obj=new App();
    	obj.Customer_operation();
        
        
    }
    
    public void Customer_operation()
    {
    	Hotel hotel=new Hotel();
        DAO dao=new DAO();
        String name;
        System.out.println("Enter your choice");
        System.out.println("1:Save Customer");
        System.out.println("2:Delete Customer");
        System.out.println("3:Get Customer By Name");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:
	        System.out.println("Enter user name:");
	        hotel.setUserName(sc.next());
	        
	        System.out.println("Enter email:");
	        hotel.setEmail(sc.next());
	        
	        System.out.println("Enter password:");
	        hotel.setPassword(sc.next());
	        
	        System.out.println("Enter Phone No.:");
	        hotel.setPhoneNo(sc.next());
	        
	        System.out.println("Enter Age.:");
	        hotel.setAge(sc.nextInt());
	        
	        System.out.println("Enter country.:");
	        hotel.setContry(sc.next());
	        
	        System.out.println("Enter state.:");
	        hotel.setState(sc.next());
	        
	        dao.saveProduct(hotel);
	        
	        System.out.println(hotel);
	        
	        break;
        case 2:
        		System.out.println("Enter Product ID");
        		 name=sc.next();
        		 dao.deleteCustomer(name);
        		
        	break;
        
        case 3:
        	System.out.println("Enter Product ID");
    			 name=sc.next();
    			 dao.getCustByname(name);
        	break;
        	
        }
        
    }
    
}

