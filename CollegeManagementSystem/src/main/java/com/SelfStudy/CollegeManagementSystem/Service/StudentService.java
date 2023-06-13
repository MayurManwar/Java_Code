package com.SelfStudy.CollegeManagementSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SelfStudy.CollegeManagementSystem.dao.StudentDao;
import com.SelfStudy.CollegeManagementSystem.entity.ManagementDepartment;
import com.SelfStudy.CollegeManagementSystem.entity.Student;

@Service
public class StudentService {

	/* .................CRUD OPERATION............ */
	
	@Autowired
	StudentDao sd;

	public List<Student> getAllStudentDetails() {

		return sd.getAllStudentDetails();

	}

	/* ............................................ */

	public String deleteDetailsFromStudent(int id) {
		return sd.deleteDetailsFromStudent(id);
	}

	/* ............................................ */

	public String insertIntoStudent(Student detail) {
		return sd.insertIntoStudent(detail);
	}

	/* ............................................ */

	public String updateDetailOfStudent(Student update) {
		return sd.updateDetailOfStudent(update);
	}

	/* ..............USING CRITERIA METHOD....... */

	public List<Student> markGreaterThan80fromstudent() {

		return sd.markGreaterThan80fromstudent();

	}
	/* ............................................ */

	public List<Student> markLessThan80fromstudent() {
		return sd.markLessThan80fromstudent();
	}

	/* ............................................ */

	public List<Student> markBetweenfromstudent() {
		return sd.markBetweenfromstudent();

	}

	/* ............................................ */

	public List<Student> nameLikeSfromstudent() {

		return sd.nameLikeSfromstudent();

	}

	/* ............................................ */

	public List<Student> getstudentnameBelongPune() {
		return sd.getstudentnameBelongPune();

	}

	/* ............................................ */

	public List<Student> getNameOfMaxMarkOfStudent() {
		return sd.getNameOfMaxMarkOfStudent();

	}
	/* ............................................ */

	public List<Student> getNameOfMinMarkOfStudent() {
		return sd.getNameOfMinMarkOfStudent();
	}
	/* ............................................ */

	public List<Student> sumOfStudentMark() {
		return sd.sumOfStudentMark();
	}
	/* ............................................ */

	public List<Student> avgOfStudentMark() {
		return sd.avgOfStudentMark();

	}
	/* ............................................ */

	public List<Student> countOfRowOfStudentTable() {
		return sd.countOfRowOfStudentTable();

	}
	/* ............................................ */

	public List<Student> rowCcountOfRowOfStudentTable() {
	return	sd.rowCcountOfRowOfStudentTabl();

	}
	/* .................USING 2 CRITERIA................. */

	public List<Student> markGreatert75AndPassingyearMoreThan2021() {
		List<Student>list=	sd.markGreatert75AndPassingyearMoreThan2021();
		
		List<Student> al=new ArrayList<>();
		for (Student student : list) {
			if(Integer.parseInt(student.getPassingyear())> Integer.parseInt("2021") && student.getBranch().equals("mechanical")) {
				al.add(student);
			}
			else {
				return null;
			}
		}
		return al;
	}
	
	


	public List<Student> ageMorethan20AndNameIntialM() {
	List<Student>	list=sd.ageMorethan20AndNameIntialM();
	
	List<Student>al= new ArrayList<>();
	for (Student st : list) {
		if (st.getName().startsWith("m")) {
			
			al.add(st);
		}
		else {
			return null;
		}
		
	}
	return al;
		
	}

}
