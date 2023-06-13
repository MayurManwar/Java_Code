package com.SessionMethod;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	
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
		
	Student st= new Student();
	
	
	st.setId(5);
	st.setName("Shruti");
	st.setMark("78");
	
	session.update(st);
	
	System.out.println("Update has been Successful.......");
	
	tr.commit();
	
	session.close();
	

}


}
