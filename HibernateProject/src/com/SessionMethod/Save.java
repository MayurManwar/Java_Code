package com.SessionMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {
	
	
public static void main(String[] args) {
		
		
		
		
		Configuration cf = new Configuration();
		
		cf.configure("mayur.cfg.xml");
		
		cf.addAnnotatedClass(Student.class);
		
	SessionFactory sf= cf.buildSessionFactory();
		
		Session session =sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
	Student st= new Student();
	
	
	st.setId(33);
	st.setName("dk");
	st.setMark("78");
	
	session.update(st);
	
	System.out.println("Save has been Successful.......");
	
	tr.commit();
	
	session.close();
	

}

}
