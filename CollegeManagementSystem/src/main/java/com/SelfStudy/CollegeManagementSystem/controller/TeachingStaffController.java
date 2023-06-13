package com.SelfStudy.CollegeManagementSystem.controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SelfStudy.CollegeManagementSystem.Service.TeachingStaffService;
import com.SelfStudy.CollegeManagementSystem.entity.NonTeachingStaff;
import com.SelfStudy.CollegeManagementSystem.entity.TeachingStaff;

@RestController
public class TeachingStaffController {
	
	/* .................CRUD OPERATION............ */
	
	 @Autowired
	private TeachingStaffService ts;
	 
	 @GetMapping("getdatails")
	public List<TeachingStaff> getDetailsFromTeachingStaff() {
		
	return	ts.getDetailsFromTeachingStaff();
		
		
	}
	
	 /*.........................................................*/
	 @DeleteMapping("/deletefromTeachingStaff/{id}")
	public String deleteDetailsFromTeachingStaff(@PathVariable int id) {
		 
	return	 ts.deleteDetailsFromTeachingStaff(id);
		
	}
	 /*.......................................................*/

	 
	 @PostMapping("insertDetailsIntoTeachingStaff")
	 public String insertDetailsIntoTeachingStaff(@RequestBody TeachingStaff insert) {
		 
		return ts.insertDetailsIntoTeachingStaff(insert);
	 }
	 /*.........................................................*/
	 
	 @PutMapping("updateDetailsOfTeachingStaff")
	 public String updateDetailsOfTeachingStaff(@RequestBody TeachingStaff update) {
		return ts.updateDetailsOfTeachingStaff(update);
		 
	 }
	 
	 /*...............USING CRITERIA METHOD............*/

	 @GetMapping("salaryGreaterThan80KfromNonTeachingStaff")
public List<TeachingStaff> salaryGreaterThan80KfromNonTeachingStaff(){
	return ts.salaryGreaterThan80KfromNonTeachingStaff();
}
	 /*.....................................................*/
	 
	 @GetMapping("salarylessThan80KfromNonTeachingStaff")
	 public List<TeachingStaff> salarylessThan80KfromNonTeachingStaff() {
		return ts.salarylessThan80KfromNonTeachingStaff() ;
		 
	 }
	 
	 /*.......................................................*/
	 
	 
	 @GetMapping("salaryBetween60kTo90KfromNonTeachingStaff")
	 public List<TeachingStaff> salaryBetween60kTo90KfromNonTeachingStaff() {
		
		return ts.salaryBetween60kTo90KfromNonTeachingStaff();
	}
	 
	 /*.....................................................*/
	 @GetMapping("nameLikeSagarsir")
	 public List<TeachingStaff> nameLikeSagarsir() {
		return ts.nameLikeSagarsir();
		
	}
	 /*..................................................*/
	 
	 @GetMapping("getTeachernameBelongcCompuerDeff")
	 public List<TeachingStaff> getTeachernameBelongcCompuerDeff() {
		
		return ts.getTeachernameBelongcCompuerDeff();
	}
	 
	 /*.........USING PROJECTION METHOD.....................*/
	
	 @GetMapping("getNameofMaxsalaryTeacher")
	 public List<TeachingStaff> getNameofMaxsalaryTeacher() {
		return ts.getNameofMaxsalaryTeacher();
	 }
	 
	 /*..................................................*/
	 
	 @GetMapping("getNameofMinsalaryTeacher")
	 public List<TeachingStaff> getNameofMinsalaryTeacher() {
	return	ts. getNameofMinsalaryTeacher();
	}
	 
	 /*..................................................*/
	 
	 @GetMapping("sumOfTeacherSalary")
	 public List<TeachingStaff> sumOfTeacherSalary() {
		
		return ts.sumOfTeacherSalary();
	}
	 /*..................................................*/
	 
	 @GetMapping("avgOfTeacherSalary")
	 public List<TeachingStaff> avgOfTeacherSalary() {
	return	ts.avgOfTeacherSalary();
	}
	 /*..................................................*/
	 
	 
	 @GetMapping("countOfTeacherSalary")
	 public List<TeachingStaff> countOfTeacherSalary() {
	return	ts. countOfTeacherSalary();
	}
	 /*..................................................*/
	 
	 @GetMapping("countRowOfTeacherSalary")
	 public List<TeachingStaff> countRowOfTeacherSalary() {
		
	return	ts.countRowOfTeacherSalary();
	}
}








