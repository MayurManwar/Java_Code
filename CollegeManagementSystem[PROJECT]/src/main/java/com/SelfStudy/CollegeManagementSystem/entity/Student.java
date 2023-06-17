package com.SelfStudy.CollegeManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private int id;
	private String name;
	private String Branch;
	private String mark;
	private String location;
	private String passingyear;
	private String AdmissionYear;
	private String age;
	@Id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdmissionYear() {
		return AdmissionYear;
	}

	public void setAdmissionYear(String admissionYear) {
		AdmissionYear = admissionYear;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Branch=" + Branch + ", mark=" + mark + ", location="
				+ location + ", passingyear=" + passingyear + "]";
	}

}
