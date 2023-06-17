package com.SelfStudy.CollegeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SelfStudy.CollegeManagementSystem.Service.StudentService;
import com.SelfStudy.CollegeManagementSystem.entity.Student;

@RestController
public class StudentController {

	
	/* .................CRUD OPERATION............ */
	
	@Autowired
	private StudentService sc;

	@GetMapping("asdf")
	public List<Student> getAllStudentDetails() {

		return sc.getAllStudentDetails();

	}

	/* ............................................ */

	
	@DeleteMapping("/delete/{id}")
	public String deleteDetailsFromStudent(@PathVariable int id) {

		return sc.deleteDetailsFromStudent(id);
	}

	/* ............................................ */

	@PostMapping("insert")
	public String insertIntoStudent(@RequestBody Student detail) {
		return sc.insertIntoStudent(detail);

	}

	/* ............................................ */

	@PutMapping("update")
	public String updateDetailOfStudent(@RequestBody Student update) {

		return sc.updateDetailOfStudent(update);
	}

	/* .............USING CRITERIA METHOD............. */

	@GetMapping("markGreaterThan80fromstudent")
	public List<Student> markGreaterThan80fromstudent() {

		return sc.markGreaterThan80fromstudent();
	}

	/* ............................................ */

	@GetMapping("markLessThan80fromstudent")
	public List<Student> markLessThan80fromstudent() {
		return sc.markLessThan80fromstudent();

	}

	/* ............................................ */

	@GetMapping("markBetweenfromstudent")
	public List<Student> markBetweenfromstudent() {
		return sc.markBetweenfromstudent();
	}

	/* ............................................ */

	@GetMapping("nameLikeSfromstudent")
	public List<Student> nameLikeSfromstudent() {
		return sc.nameLikeSfromstudent();
	}

	/* ............................................ */

	@GetMapping("getstudentnameBelongPune")
	public List<Student> getstudentnameBelongPune() {

		return sc.getstudentnameBelongPune();
	}

	/* .........USING PROJECTION METHOD................ */

	@GetMapping("getNameOfMaxMarkOfStudent")
	public List<Student> getNameOfMaxMarkOfStudent() {

		return sc.getNameOfMaxMarkOfStudent();

	}
	/* ............................................ */

	@GetMapping("getNameOfMinMarkOfStudent")
	public List<Student> getNameOfMinMarkOfStudent() {

		return sc.getNameOfMinMarkOfStudent();
	}

	/* ............................................ */

	@GetMapping("sumOfStudentMark")
	public List<Student> sumOfStudentMark() {

		return sc.sumOfStudentMark();
	}

	/* ............................................ */

	@GetMapping("avgOfStudentMark")
	public List<Student> avgOfStudentMark() {
		return sc.avgOfStudentMark();

	}
	/* ............................................ */

	@GetMapping("countOfRowOfStudentTable")
	public List<Student> countOfRowOfStudentTable() {
		return sc.countOfRowOfStudentTable();
	}
	/* ............................................ */

	@GetMapping("rowCcountOfRowOfStudentTable")
	public List<Student> rowCcountOfRowOfStudentTable() {
	return	sc.rowCcountOfRowOfStudentTable();
	}
	/* ...................USING 2 RESCRTITION......................... */
	
	
	@GetMapping("markGreatert75AndPassingyearMoreThan2021")
	public List<Student> markGreatert75AndPassingyearMoreThan2021() {
		
	return sc.markGreatert75AndPassingyearMoreThan2021();	
		
	}
	
	@GetMapping("ageMorethan20AndNameIntialM")
	public List<Student> ageMorethan20AndNameIntialM() {
	return	sc.ageMorethan20AndNameIntialM();
	}
	
}
