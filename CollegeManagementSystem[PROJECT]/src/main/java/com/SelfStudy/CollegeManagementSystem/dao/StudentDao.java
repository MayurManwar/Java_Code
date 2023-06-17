package com.SelfStudy.CollegeManagementSystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SelfStudy.CollegeManagementSystem.entity.ManagementDepartment;
import com.SelfStudy.CollegeManagementSystem.entity.Student;

@Repository

public class StudentDao {

	/* .................CRUD OPERATION............ */
	
	@Autowired
	SessionFactory sf;

	public List<Student> getAllStudentDetails() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> mm = criteria.list();
		return mm;
	}
	/* ............................................ */

	public String deleteDetailsFromStudent(int id) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		Student st = session.get(Student.class, id);
		session.delete(st);
		tr.commit();

		return "Delele Details from Student";

	}

	/* ............................................ */

	public String insertIntoStudent(Student detail) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(detail);
		transaction.commit();

		return " inserted detail into Sudent ";
	}

	/* ............................................ */

	public String updateDetailOfStudent(Student update) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();
		session.update(update);
		tr.commit();

		return " update details of Student";

	}

	/* .........USING CRITERIA METHOD...... */

	public List<Student> markGreaterThan80fromstudent() {

		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("mark", "80"));
		List<Student> chiku = criteria.list();
		return chiku;
	}
	/* ............................................ */

	public List<Student> markLessThan80fromstudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.lt("mark", "80"));
		List<Student> chiku = criteria.list();
		return chiku;

	}

	/* ............................................ */

	public List<Student> markBetweenfromstudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.between("mark", "75", "85"));
		List<Student> mayur = criteria.list();
		return mayur;

	}

	/* ............................................ */

	public List<Student> nameLikeSfromstudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.like("name", "m"));
		List<Student> mayur = criteria.list();

		return mayur;

	}

	/* ............................................ */
	public List<Student> getstudentnameBelongPune() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("location", "pune"));
		List<Student> mm = criteria.list();
		return mm;
	}
	/* ..........USING PROJECTION METHOD.............. */

	public List<Student> getNameOfMaxMarkOfStudent() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.max("mark"));
		List<Student> mayur = criteria.list();

		return mayur;

	}
	/* ............................................ */

	public List<Student> getNameOfMinMarkOfStudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.min("mark"));
		List<Student> chiku = criteria.list();
		return chiku;
	}
	/* ............................................ */

	public List<Student> sumOfStudentMark() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.sum("mark"));
		List<Student> mayu = criteria.list();
		return mayu;

	}

	/* ............................................ */

	public List<Student> avgOfStudentMark() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.avg("mark"));
		List<Student> chiku = criteria.list();
		return chiku;
	}
	/* ............................................ */

	public List<Student> countOfRowOfStudentTable() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.count("name"));
		List<Student> mayu = criteria.list();
		return mayu;

	}
	/* ............................................ */

	public List<Student> rowCcountOfRowOfStudentTabl() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.rowCount());
		List<Student> chiku = criteria.list();
		return chiku;
	}
	/* ............................................ */

	public List<Student> markGreatert75AndPassingyearMoreThan2021() {
		Session session =sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("mark", "75"));
	List<Student>	nik =criteria.list();
		System.out.println(nik);
		return nik;
	}

	public List<Student> ageMorethan20AndNameIntialM() {
		Session session= sf.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("age", "19"));
	List<Student>	mayur=criteria.list();
	System.out.println(mayur);
	return mayur;
		
	}
}
