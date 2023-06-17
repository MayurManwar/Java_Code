package com.SelfStudy.CollegeManagementSystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SelfStudy.CollegeManagementSystem.entity.NonTeachingStaff;

@Repository
public class NonTeachingStaffDao {
	
	/* .................CRUD OPERATION............ */
	
	@Autowired
	SessionFactory sf;

	public List<NonTeachingStaff> getAllDetailsFromNonTeachingStaff() {

		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(NonTeachingStaff.class);

		List<NonTeachingStaff> chiku = criteria.list();

		return chiku;
	}
	
	/*...............................................................................*/
	public String getAllDetailsFromNonTeachingStaff(int id) {
		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		NonTeachingStaff chiku = session.get(NonTeachingStaff.class, id);
		session.delete(chiku);
		tr.commit();
		return"get All Details From NonTeachingStaff";
	}
	
	/*...............................................................................*/

	public String getAllDetailsFromNonTeachingStaff(NonTeachingStaff insert) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		session.save(insert);
		tr.commit();
		
		return "get All Details From NonTeachingStaff";
	}
	
	/*...............................................................................*/

	public String updateDetailsIntoNonTeachingStaff(NonTeachingStaff update) {

		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		session.update(update);
		tr.commit();
		
		return "update Details Into NonTeachingStaff";
	}
	/*...............................................................................*/


	public List<NonTeachingStaff> nameLikePatilFromNonTeachingstaff() {
		Session session= sf.openSession();
		Criteria criteria =session.createCriteria(NonTeachingStaff.class);
		criteria.add(Restrictions.like("name", " p"));
		List<NonTeachingStaff> chiku= criteria.list();
		
		return chiku;
		
	}
	/*...............................................................................*/
	
	public List<NonTeachingStaff> getNameBelongToComputerOperator() {
		Session session= sf.openSession();
		Criteria criteria= session.createCriteria(NonTeachingStaff.class);
		criteria.add(Restrictions.eq("profile", "Computer Operator"));
	List<NonTeachingStaff> mayur=	criteria.list();
	return mayur;
		
	}
	/*...............................................................................*/
	
	public List<NonTeachingStaff> getNameNotBelongToHeadClerk() {
		Session session = sf.openSession();
		Criteria criteria =session.createCriteria(NonTeachingStaff.class);
		criteria.add(Restrictions.ne("profile", "Head Clerk"));
	List<NonTeachingStaff>	chiku= criteria.list();
		return chiku;
	}
	/*...............................................................................*/

	public List<NonTeachingStaff> getnamenameHavepatil() {
		Session session= sf.openSession();
		Criteria criteria= session.createCriteria(NonTeachingStaff.class);
		criteria.add(Restrictions.eq("name", "patil"));
	List<NonTeachingStaff> mayur=	criteria.list();
	return mayur;
			
		
	}
	/*....................................................*/


	public List<NonTeachingStaff> countRowOfNonTeacher() {
		Session session = sf.openSession();
		Criteria criteria =session.createCriteria(NonTeachingStaff.class);
		criteria.setProjection(Projections.count("name"));
	List<NonTeachingStaff> mayu=	criteria.list();
	return mayu;
	}
	/*....................................................*/


	public List<NonTeachingStaff> propertyOfNonTeacher() {
		
		Session session = sf.openSession();
		Criteria criteria =session.createCriteria(NonTeachingStaff.class);
		criteria.setProjection(Projections.property("name"));
	List<NonTeachingStaff> mayu=	criteria.list();
	return mayu;
	}
	/*....................................................*/


	public List<NonTeachingStaff> operationOfNonTeacher() {
		
		Session session = sf.openSession();
		Criteria criteria =session.createCriteria(NonTeachingStaff.class);
		criteria.setProjection(Projections.groupProperty("name"));
	List<NonTeachingStaff> mayu=	criteria.list();
	return mayu;
	}
	
	/*....................................................*/


}
