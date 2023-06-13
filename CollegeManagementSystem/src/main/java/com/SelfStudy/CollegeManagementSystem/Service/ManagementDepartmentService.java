package com.SelfStudy.CollegeManagementSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SelfStudy.CollegeManagementSystem.dao.ManagementDepartmentDao;
import com.SelfStudy.CollegeManagementSystem.entity.ManagementDepartment;
import com.SelfStudy.CollegeManagementSystem.entity.Student;

@Service

public class ManagementDepartmentService {

	/* .................CRUD OPERATION............ */

	@Autowired
	ManagementDepartmentDao md;

	public List<ManagementDepartment> getAllDetailsManagementDepartment() {

		return md.getAllDetailsManagementDepartment();

	}

	/* ............................................ */
	

	public String deleteDetailsFromManagementDepartment(int id) {
		return md.deleteDetailsFromManagementDepartment(id);

	}

	/* ............................................ */

	public String insertDetailsIntoManagementDepartment(ManagementDepartment insert) {
		return md.insertDetailsIntoManagementDepartment(insert);

	}

	/* ............................................ */

	public String updateDetailsIntoManagementDepartment(ManagementDepartment update) {
		return md.updateDetailsIntoManagementDepartment(update);
	}

	/* ............................................ */

	public List<ManagementDepartment> ageGreaterThan50yrOfManagementDepartment() {
		return md.ageGreaterThan50yrOfManagementDepartment();

	}
	
	/* ............................................ */
	


	public List<ManagementDepartment> ageLessThan50yrOfManagementDepartment() {
	return	md.ageLessThan50yrOfManagementDepartment();
	}
	/* ............................................ */
	

	public List<ManagementDepartment> ageBetween50To60yrOfManagementDepartment() {
	return	md.insertDetailsIntoManagementDepartment();
		
	}
	/* ............................................ */
	

	public List<ManagementDepartment> ageEqualAs53yrOfManagementDepartment() {
	return	md.ageEqualAs53yrOfManagementDepartment();
		
	}
	/* ............................................ */
	

	public List<ManagementDepartment> notBelongToPuneLocationFromManagementDepartment() {
	return	md.notBelongToPuneLocationFromManagementDepartment();
		
	}
	/* ............................................ */
	

	public List<ManagementDepartment> nameStartWirhS() {
	return	md.nameStartWirhS();
		
	}
	/* ............................................ */
	

	public List<ManagementDepartment> showNamePropertiesOfManagementDepartment() {
	return	md.showNamePropertiesOfManagementDepartment();
	}

	/* ............................................ */
	
	
	
	public List<ManagementDepartment> getnamehavingAgemoreThan40yrAndsalaryLessthan80kAndBelongtodigras() {
		List<ManagementDepartment>	list =md.getnamehavingAgemoreThan40yrAndsalaryLessthan80kAndBelongtoMumbai();
	
		List<ManagementDepartment> mn= new ArrayList<>();
		
	for (ManagementDepartment md : list) {
		if (Integer.parseInt(md.getSalary()) < Integer.parseInt("80000") && md.getLocation().equals("mumbai")) {
			mn.add(md);
		}
		else {
			return null;
		}
	}
		return mn;	
		}
		
	
		
	}


