package com.SelfStudy.CollegeManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SelfStudy.CollegeManagementSystem.dao.NonTeachingStaffDao;
import com.SelfStudy.CollegeManagementSystem.entity.NonTeachingStaff;

@Service
public class NonTeachingStaffSevice {

	/* .................CRUD OPERATION............ */
	
	@Autowired

	NonTeachingStaffDao nd;

	public List<NonTeachingStaff> getAllDetailsFromNonTeachingStaff() {

		return nd.getAllDetailsFromNonTeachingStaff();

	}

	/*
	 * .............................................................................
	 * ..
	 */

	public String getAllDetailsFromNonTeachingStaff(int id) {
		return nd.getAllDetailsFromNonTeachingStaff(id);

	}
	/*
	 * .............................................................................
	 * ..
	 */

	public String getAllDetailsFromNonTeachingStaff(NonTeachingStaff insert) {
		return nd.getAllDetailsFromNonTeachingStaff(insert);
	}

	/*
	 * .............................................................................
	 * ..
	 */

	public String updateDetailsIntoNonTeachingStaff(NonTeachingStaff update) {
		return nd.updateDetailsIntoNonTeachingStaff(update);

	}
	/*
	 * .............................................................................
	 * ..
	 */

	public List<NonTeachingStaff> nameLikePatilFromNonTeachingstaff() {
		return nd.nameLikePatilFromNonTeachingstaff();

	}
	/*
	 * .............................................................................
	 * ..
	 */

	public List<NonTeachingStaff> getNameBelongToComputerOperator() {
		return nd.getNameBelongToComputerOperator();

	}
	/*
	 * .............................................................................
	 * ..
	 */

	public List<NonTeachingStaff> getNameNotBelongToHeadClerk() {
		return nd.getNameNotBelongToHeadClerk();
	}
	/*
	 * .............................................................................
	 * ..
	 */

	public List<NonTeachingStaff> getnamenameHavepatil() {
		return nd.getnamenameHavepatil();

	}
	/* .................................................... */

	public List<NonTeachingStaff> countRowOfNonTeacher() {
		return nd.countRowOfNonTeacher();

	}
	/* .................................................... */

	public List<NonTeachingStaff> propertyOfNonTeacher() {
		return nd.propertyOfNonTeacher();

	}
	/* .................................................... */

	public List<NonTeachingStaff> operationOfNonTeacher() {
		return nd.operationOfNonTeacher();

	}
}
