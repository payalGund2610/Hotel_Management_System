package com.Database.HotelManagement.utility;

import com.Database.HotelManagement.entity.*;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;


public class HibernateUtility 
{
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			try 
			{
				Configuration configuration=new Configuration();
				Properties settings=new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/anudip");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Hotel.class);
				
				StandardServiceRegistry serviceRegistery=new StandardServiceRegistryBuilder().
						applySettings(configuration.getProperties()).build();
						
				sessionFactory=configuration.buildSessionFactory(serviceRegistery);
				
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		return sessionFactory;
		
	}

}
