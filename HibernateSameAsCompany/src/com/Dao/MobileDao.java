package com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.Confi.HibernateConfig;
import com.Entity.Mobile;

/*.......Criteria and Projection  method.........*/

public class MobileDao {

	private SessionFactory sf = HibernateConfig.getconfi(); // make a globle variable 
													// because don't call again
													// and again

	/* .........Homework........... */

	public void startwiths() {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Mobile.class);

		cr.setProjection(Projections.groupProperty("name"));

		cr.add(Restrictions.ilike("name", "s%"));

		List<Mobile> mayur = cr.list();
	}

	public void Startwith1() {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Mobile.class);
		cr.setProjection(Projections.groupProperty("price"));

		cr.add(Restrictions.ilike("price", "1%"));

		List<Mobile> chiku = cr.list();

		System.out.println(chiku);
	}

	/*
	 * .......homework end ...
	 */

	/* ...........Criteria Method............... */

	public List<Mobile> equalmobile() {

		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(Mobile.class);

		criteria.add(Restrictions.eq("name", "mi"));

		List<Mobile> mayu = criteria.list();

		return mayu;

	}

	public List<Mobile> lessthanmobile() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Mobile.class);

		criteria.add(Restrictions.lt("price", "60000"));

		List<Mobile> bb = criteria.list();

		return bb;

	}

	public List<Mobile> greaterthanmobile() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Mobile.class);

		criteria.add(Restrictions.gt("price", "100000"));

		List<Mobile> chiku = criteria.list();

		return chiku;

	}

	public List<Mobile> likemobile() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Mobile.class);

		criteria.add(Restrictions.like("name", "r"));

		List<Mobile> mayu = criteria.list();

		return mayu;

	}

	public List<Mobile> betweenmobile() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Mobile.class);

		criteria.add(Restrictions.between("price", "40000", "80000"));

		List<Mobile> mayu = criteria.list();

		return mayu;
	}

	/* ......................Projection........................... */

	public List<Mobile> maxtmobile() {

		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Mobile.class);

		cr.setProjection(Projections.max("price"));
		List<Mobile> mayur = cr.list();

		return mayur;

	}

	public List<Mobile> countmobile() {

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Mobile.class);

		cr.setProjection(Projections.count("name"));

		List<Mobile> chiku = cr.list();
		System.out.println(chiku);

		return chiku;

	}

	public List<Mobile> minmobile() {

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Mobile.class);

		cr.setProjection(Projections.min("price"));

		List<Mobile> shru = cr.list();

		return shru;
	}

	public List<Mobile> summobile() {

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Mobile.class);

		cr.setProjection(Projections.sum("price"));

		List<Mobile> nik = cr.list();

		return nik;
	}

	public List<Mobile> avgmobile() {
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Mobile.class);
		cr.setProjection(Projections.avg("price"));
		List<Mobile> mayu = cr.list();

		return mayu;
	}

	public List<Mobile> rowcountmobile() {

		Session session = sf.openSession();

		Criteria cr = session.createCriteria(Mobile.class);
		cr.setProjection(Projections.rowCount());

		List<Mobile> chiku = cr.list();
		
		return chiku;

		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		MobileDao mm= new MobileDao();
		
		mm.countmobile();
	}
}






