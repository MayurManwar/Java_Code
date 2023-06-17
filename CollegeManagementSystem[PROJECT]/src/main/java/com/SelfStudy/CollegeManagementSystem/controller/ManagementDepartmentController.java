package com.SelfStudy.CollegeManagementSystem.controller;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SelfStudy.CollegeManagementSystem.Service.ManagementDepartmentService;
import com.SelfStudy.CollegeManagementSystem.entity.ManagementDepartment;

@RestController
public class ManagementDepartmentController {

	/* .................CRUD OPERATION............ */
	@Autowired
	ManagementDepartmentService ms;

	@GetMapping("getAllDetailsManagementDepartment")
	public List<ManagementDepartment> getAllDetailsManagementDepartment() {

		return ms.getAllDetailsManagementDepartment();
	}
	
	/* ............................................ */

	

	@DeleteMapping("deleteDetailsFromManagementDepartment")
	public String deleteDetailsFromManagementDepartment(@PathVariable int id) {
		return ms.deleteDetailsFromManagementDepartment(id);

	}

	/* ............................................ */

	
	@PostMapping("insertDetailsIntoManagementDepartment")
	public String insertDetailsIntoManagementDepartment(@RequestBody ManagementDepartment insert) {
	return	ms.insertDetailsIntoManagementDepartment(insert);
	}

	/* ............................................ */

	
	@PutMapping("updateDetailsIntoManagementDepartment")
	public String updateDetailsIntoManagementDepartment(@RequestBody ManagementDepartment update) {
	return	ms.updateDetailsIntoManagementDepartment(update);
	}

	/* ................USING CRITERIA METHOD............................ */

	@GetMapping("ageGreaterThan50yrOfManagementDepartment")
	public List<ManagementDepartment> ageGreaterThan50yrOfManagementDepartment() {
		
	return	ms.ageGreaterThan50yrOfManagementDepartment();
	}

	/* ............................................ */

	
	@GetMapping("ageLessThan50yrOfManagementDepartment")
	public List<ManagementDepartment> ageLessThan50yrOfManagementDepartment() {
	return	ms.ageLessThan50yrOfManagementDepartment();
	}

	/* ............................................ */

	
	public List<ManagementDepartment> ageBetween50To60yrOfManagementDepartment() {
		
	return	ms.ageBetween50To60yrOfManagementDepartment();
	}

	/* ............................................ */

	
	@GetMapping("ageEqualAs53yrOfManagementDepartment")
	public List<ManagementDepartment> ageEqualAs53yrOfManagementDepartment() {
	return	ms.ageEqualAs53yrOfManagementDepartment();
	}
	
	/* ............................................ */

@GetMapping("notBelongToPuneLocationFromManagementDepartment")
	public List<ManagementDepartment> notBelongToPuneLocationFromManagementDepartment(){
	return	ms.notBelongToPuneLocationFromManagementDepartment();
	}

/* ............................................ */


@GetMapping("nameStartWirhS")
public List<ManagementDepartment> nameStartWirhS() {
return	ms.nameStartWirhS();
	
}

/* ............................................ */


@GetMapping("showNamePropertiesOfManagementDepartment")
public List<ManagementDepartment> showNamePropertiesOfManagementDepartment() {
return	ms.showNamePropertiesOfManagementDepartment();
}

/* ............................................ */

@GetMapping("getnamehavingAgemoreThan40yrAndsalaryLessthan80kAndBelongtoMumbai")
public List<ManagementDepartment> getnamehavingAgemoreThan40yrAndsalaryLessthan80kAndBelongtoMumbai() {
return	ms.getnamehavingAgemoreThan40yrAndsalaryLessthan80kAndBelongtodigras();
}
}





