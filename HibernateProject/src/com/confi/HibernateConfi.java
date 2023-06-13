package com.confi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Vehicle;

public class HibernateConfi {

	public static SessionFactory getconfi(){
		
		
		
		Configuration cf= new Configuration();
		cf.configure("mayur.cfg.xml");
		
		cf.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		
		
		return sf;
	}
	
	
}
