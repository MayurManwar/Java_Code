package com.SelfStudy.CollegeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SelfStudy.CollegeManagementSystem.Service.NonTeachingStaffSevice;
import com.SelfStudy.CollegeManagementSystem.entity.NonTeachingStaff;

@RestController
public class NonTeachingStaffController {

	/* .................CRUD OPERATION............ */
	@Autowired
	NonTeachingStaffSevice ns;

	@GetMapping("getAllDetailsFromNonTeachingStaff")
	public List<NonTeachingStaff> getAllDetailsFromNonTeachingStaff() {

		return ns.getAllDetailsFromNonTeachingStaff();

	}

	/* ................................................... */

	@DeleteMapping("/getAllDetailsFromNonTeachingStaff/{id}")
	public String deleteAllDetailsFromNonTeachingStaff(@PathVariable int id) {

		return ns.getAllDetailsFromNonTeachingStaff(id);

	}

	/* ................................................ */

	@PostMapping("getAllDetailsFromNonTeachingStaff")
	public String insertDetailsIntoNonTeachingStaff(@RequestBody NonTeachingStaff insert) {

		return ns.getAllDetailsFromNonTeachingStaff(insert);

	}
	/* ................................................... */

	@PutMapping("updateDetailsIntoNonTeachingStaff")
	public String updateDetailsIntoNonTeachingStaff(@RequestBody NonTeachingStaff update) {
		return ns.updateDetailsIntoNonTeachingStaff(update);

	}
	/* ............................................. */

	@GetMapping("nameLikePatilFromNonTeachingstaff")
	public List<NonTeachingStaff> nameLikePatilFromNonTeachingstaff() {

		return ns.nameLikePatilFromNonTeachingstaff();
	}
	/* ........................................... */

	@GetMapping("getNameBelongToComputerOperator")
	public List<NonTeachingStaff> getNameBelongToComputerOperator() {

		return ns.getNameBelongToComputerOperator();
	}
	/* .............................................. */

	@GetMapping("getNameNotBelongToHeadClerk")
	public List<NonTeachingStaff> getNameNotBelongToHeadClerk() {

		return ns.getNameNotBelongToHeadClerk();
	}

	/* .............................................. */

	@GetMapping("getnamenameHavepatil")

	public List<NonTeachingStaff> getnamenameHavepatil() {
		return ns.getnamenameHavepatil();

	}
	/* .................................................... */

	@GetMapping("countRowOfNonTeacher")
	public List<NonTeachingStaff> countRowOfNonTeacher() {
		return ns.countRowOfNonTeacher();
	}
	/* .................................................... */

	@GetMapping("propertyOfNonTeacher")
	public List<NonTeachingStaff> propertyOfNonTeacher() {
		return ns.propertyOfNonTeacher();
	}
	/* .................................................... */

	@GetMapping("operationOfNonTeacher")
	public List<NonTeachingStaff> operationOfNonTeacher() {

		return ns.operationOfNonTeacher();
		/* .................................................... */

	}
}
