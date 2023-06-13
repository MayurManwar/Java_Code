package com.SelfStudy.CollegeManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SelfStudy.CollegeManagementSystem.dao.TeachingStaffDao;
import com.SelfStudy.CollegeManagementSystem.entity.NonTeachingStaff;
import com.SelfStudy.CollegeManagementSystem.entity.TeachingStaff;

@Service
public class TeachingStaffService {

	/* .................CRUD OPERATION............ */
	
	@Autowired
	TeachingStaffDao td;

	public List<TeachingStaff> getDetailsFromTeachingStaff() {

		return td.getDetailsFromTeachingStaff();

	}
	/* .................................................. */

	public String deleteDetailsFromTeachingStaff(int id) {

		return td.deleteDetailsFromTeachingStaff(id);

	}
	/* ..................................................... */

	public String insertDetailsIntoTeachingStaff(TeachingStaff insert) {

		return td.insertDetailsIntoTeachingStaff(insert);

	}
	/* ......................................... */

	public String updateDetailsOfTeachingStaff(TeachingStaff update) {
		return td.updateDetailsOfTeachingStaff(update);

	}

	/* ...........USING CRITERIA METHOD.............. */

	public List<TeachingStaff> salaryGreaterThan80KfromNonTeachingStaff() {
		return td.salaryGreaterThan80fromNonTeachingStaff();

	}

	/* ...................................................... */

	public List<TeachingStaff> salarylessThan80KfromNonTeachingStaff() {
		return td.salarylessThan80KfromNonTeachingStaff();

	}
	/* ............................................. */

	public List<TeachingStaff> salaryBetween60kTo90KfromNonTeachingStaff() {
		return td.salaryBetween60kTo90KfromNonTeachingStaff();
	}
	/* ........................................ */

	public List<TeachingStaff> nameLikeSagarsir() {
		return td.nameLikeSagarsir();

	}
	/* ............................................ */

	public List<TeachingStaff> getTeachernameBelongcCompuerDeff() {
		return td.getTeachernameBelongcCompuerDeff();

	}

	/* ............USING PROJECTION METHOD............. */

	public List<TeachingStaff> getNameofMaxsalaryTeacher() {
		return td.getNameofMaxsalaryTeacher();

	}
	/* ..................................... */

	public List<TeachingStaff> getNameofMinsalaryTeacher() {
		return td.getNameofMinsalaryTeacher();

	}
	/* ..................................... */

	public List<TeachingStaff> sumOfTeacherSalary() {
		return td.sumOfTeacherSalary();

	}
	/* ..................................... */

	public List<TeachingStaff> avgOfTeacherSalary() {

		return td.avgOfTeacherSalary();
	}
	/* ..................................... */

	public List<TeachingStaff> countOfTeacherSalary() {
		return td.countOfTeacherSalary();

	}
	/* ..................................... */

	public List<TeachingStaff> countRowOfTeacherSalary() {
		return td.countRowOfTeacherSalary();

	}

}
