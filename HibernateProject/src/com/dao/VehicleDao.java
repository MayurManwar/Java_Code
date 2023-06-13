package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Entity.Vehicle;
import com.confi.HibernateConfi;

public class VehicleDao {

	SessionFactory sf = HibernateConfi.getconfi(); // because Don't call again
													// and again so that make
													// Globle variable

	public Vehicle getvehicle() {

		Session session = sf.openSession();

		Vehicle bb = session.load(Vehicle.class, 1);

		return bb;

	}

	public boolean updatevehicle(Vehicle v) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();
		session.update(v);
		tr.commit();

		return true;

	}

	public Vehicle loadVehical() {

		Session session = sf.openSession();
		return session.load(Vehicle.class, 2);

	}

	public boolean deletevehicle(Vehicle m) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		session.delete(m);

		tr.commit();

		return true;

	}

	public boolean savevehicle(Vehicle k) {
		Session session=sf.openSession();
		
		Transaction tr =session.beginTransaction();
		
		session.save(k);
		
		tr.commit();
		
		return true;
		
	}

	
	

}
