package com.SelfStudy.CollegeManagementSystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SelfStudy.CollegeManagementSystem.entity.ManagementDepartment;
import com.SelfStudy.CollegeManagementSystem.entity.Student;

@Repository
public class ManagementDepartmentDao {

	/* .................CRUD OPERATION............ */
	
	@Autowired
	SessionFactory sf;

	public List<ManagementDepartment> getAllDetailsManagementDepartment() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(ManagementDepartment.class);
		List<ManagementDepartment> list = criteria.list();

		return list;

	}

	/* ............................................ */

	
	public String deleteDetailsFromManagementDepartment(int id) {

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		ManagementDepartment mayur = session.get(ManagementDepartment.class, id);
		session.delete(mayur);

		transaction.commit();

		return " Deleting Data from ManagementDepartment ";

	}

	/* ............................................ */

	
	public String insertDetailsIntoManagementDepartment(ManagementDepartment insert) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(insert);
		transaction.commit();
return "inserted Details Into ManagementDepartment";
	}

	/* ............................................ */

	
	public String updateDetailsIntoManagementDepartment(ManagementDepartment update) {
		
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(update);
		transaction.commit();
		return"update Details Into ManagementDepartment";
		
	}

	/* ...........USING CRITERIA METHOD.............. */
	
	public List<ManagementDepartment> ageGreaterThan50yrOfManagementDepartment() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.gt("age", "50"));
	List<ManagementDepartment>	nik =criteria.list();
		
		return nik;
	}

	public List<ManagementDepartment> ageLessThan50yrOfManagementDepartment() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.lt("age", "60"));
	List<ManagementDepartment>	mayu =criteria.list();
		
		return mayu;
		
	}

	public List<ManagementDepartment> insertDetailsIntoManagementDepartment() {
		
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.between("age", "40", "50"));
	List<ManagementDepartment>	chiku =criteria.list();
		
		return chiku;
	}

	public List<ManagementDepartment> ageEqualAs53yrOfManagementDepartment() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.eq("location", "mumbai"));
	List<ManagementDepartment>	mayu =criteria.list();
		
		return mayu;
		
	}

	public List<ManagementDepartment> notBelongToPuneLocationFromManagementDepartment() {
		
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.ne("location", "pune"));
	List<ManagementDepartment>	mayu =criteria.list();
		
		return mayu;
	}

	public List<ManagementDepartment> nameStartWirhS() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.like("location", "a%"));
	List<ManagementDepartment>	chiku =criteria.list();
		
		return chiku;
	}

	public List<ManagementDepartment> showNamePropertiesOfManagementDepartment() {
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.eqProperty("age", "50"));
	List<ManagementDepartment>	chiku =criteria.list();
		
		return chiku;
		
	}

	public List<ManagementDepartment> getnamehavingAgemoreThan40yrAndsalaryLessthan80kAndBelongtoMumbai() {
		
		Session session =sf.openSession();
		Criteria criteria=session.createCriteria(ManagementDepartment.class);
		criteria.add(Restrictions.gt("age", "40"));
	List<ManagementDepartment>age=	criteria.list();
	
	return age;
		
		
		
	}

	

	
	
	
	
	
	
	
	
	
	
	

}
