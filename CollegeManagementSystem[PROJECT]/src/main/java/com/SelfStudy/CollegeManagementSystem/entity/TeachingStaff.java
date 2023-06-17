package com.SelfStudy.CollegeManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class TeachingStaff {
	private int id;
	private String name;
	private String teachingdept;
	private String salary;
	private String teachingsub;
	private String mobileno;
	private String retirementyear;
	private String joiningyear;
	
	public String getRetirementyear() {
		return retirementyear;
	}

	public void setRetirementyear(String retirementyear) {
		this.retirementyear = retirementyear;
	}

	public String getJoiningyear() {
		return joiningyear;
	}

	public void setJoiningyear(String joiningyear) {
		this.joiningyear = joiningyear;
	}

	@Id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeachingdept() {
		return teachingdept;
	}

	public void setTeachingdept(String teachingdept) {
		this.teachingdept = teachingdept;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeachingsub() {
		return teachingsub;
	}

	public void setTeachingsub(String teachingsub) {
		this.teachingsub = teachingsub;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "TeachingStaff [id=" + id + ", name=" + name + ", teachingdept=" + teachingdept + ", salary=" + salary
				+ ", teachingsub=" + teachingsub + ", mobileno=" + mobileno + "]";
	}

}
