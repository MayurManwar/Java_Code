package com.Confi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Mobile;

public class HibernateConfig {
	
	public static SessionFactory getconfi(){
		
		Configuration cf= new Configuration();
		
		cf.configure("mayur.cfg.xml");
		
		cf.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf=cf.buildSessionFactory();
		
		return sf;
		
	}
		

}
