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
import com.SelfStudy.CollegeManagementSystem.entity.TeachingStaff;

@Repository

public class TeachingStaffDao {

	/* .................CRUD OPERATION............ */
	
	@Autowired
	SessionFactory sf;

	public List<TeachingStaff> getDetailsFromTeachingStaff() {

		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(TeachingStaff.class);

		List<TeachingStaff> mm = criteria.list();

		return mm;
	}

	/* ................................................ */

	public String deleteDetailsFromTeachingStaff(int id) {

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		TeachingStaff mayur = session.get(TeachingStaff.class, id);

		session.delete(mayur);

		return " deleting data from  TeachingStaff";
	}

	/* ................................................... */

	public String insertDetailsIntoTeachingStaff(TeachingStaff insert) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(insert);
		tr.commit();

		return "insert Details Into TeachingStaff";

	}

	/* .............................................. */

	public String updateDetailsOfTeachingStaff(TeachingStaff update) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(update);
		tr.commit();

		return "update Details Of TeachingStaff ";

	}
	/* ..................USING CRITERIA. METHOD................ */

	public List<TeachingStaff> salaryGreaterThan80fromNonTeachingStaff() {
		Session sesion = sf.openSession();
		Criteria criteria = sesion.createCriteria(TeachingStaff.class);
		criteria.add(Restrictions.gt("salary", "80000"));
		List<TeachingStaff> chiku = criteria.list();
		return chiku;
	}
	/* ................................................ */

	public List<TeachingStaff> salarylessThan80KfromNonTeachingStaff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.add(Restrictions.lt("salary", "80"));
		List<TeachingStaff> chiku = criteria.list();
		return chiku;
	}
	/* ............................................. */

	public List<TeachingStaff> salaryBetween60kTo90KfromNonTeachingStaff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.add(Restrictions.between("salary", "70", "90"));
		List<TeachingStaff> mayur = criteria.list();
		return mayur;
	}

	/* .............................................. */

	public List<TeachingStaff> nameLikeSagarsir() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.add(Restrictions.eq("name", "sagar sir"));
		List<TeachingStaff> nik = criteria.list();
		return nik;

	}
	/* ..................................... */

	public List<TeachingStaff> getTeachernameBelongcCompuerDeff() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.add(Restrictions.like("teachingdept", "computer"));
		List<TeachingStaff> mayu = criteria.list();
		return mayu;

	}
	/* ..................................... */

	public List<TeachingStaff> getNameofMaxsalaryTeacher() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.setProjection(Projections.max("salary"));
		List<TeachingStaff> mayur = criteria.list();

		return mayur;
	}
	/* ..................................... */

	public List<TeachingStaff> getNameofMinsalaryTeacher() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.setProjection(Projections.min("salary"));
		List<TeachingStaff> mayu = criteria.list();

		return mayu;
	}
	/* ..................................... */

	public List<TeachingStaff> sumOfTeacherSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.setProjection(Projections.sum("salary"));
		List<TeachingStaff> nik = criteria.list();

		return nik;

	}
	/* ..................................... */

	public List<TeachingStaff> avgOfTeacherSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.setProjection(Projections.avg("salary"));
		List<TeachingStaff> chiku = criteria.list();

		return chiku;

	}
	/* ..................................... */

	public List<TeachingStaff> countOfTeacherSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.setProjection(Projections.count("salary"));
		List<TeachingStaff> mayur = criteria.list();

		return mayur;

	}
	/* ..................................... */

	public List<TeachingStaff> countRowOfTeacherSalary() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(TeachingStaff.class);
		criteria.setProjection(Projections.rowCount());
		List<TeachingStaff> mayur = criteria.list();

		return mayur;

	}

}
