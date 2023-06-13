package com.SessionMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Get2 {
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Step 1");
		
		Configuration cf = new Configuration();
		
		System.out.println("Step 2");
		
		cf.configure("mayur.cfg.xml");
		System.out.println("Step 3");
		cf.addAnnotatedClass(Student.class);
		System.out.println("Step 4");
		
		SessionFactory sf= cf.buildSessionFactory();
		
		System.out.println("Step 5");
		
		
		Session session =sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
	Student st= session.get(Student.class, 1);
	Student st2= session.get(Student.class, 2);
	Student st3= session.get(Student.class, 3);
	
	System.out.println(st);
	System.out.println(st2);
	System.out.println(st3);
	
	tr.commit();
	
	session.close();
	

}


}
