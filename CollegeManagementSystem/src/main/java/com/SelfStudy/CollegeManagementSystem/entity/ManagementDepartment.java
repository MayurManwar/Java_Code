package com.SelfStudy.CollegeManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class ManagementDepartment {
	
	private int id;
	private String name;
	private String location;
	private String age;
	private String mobileNo;
	private String salary;
	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "ManagementDepartment [id=" + id + ", name=" + name + ", location=" + location + ", age=" + age
				+ ", mobileNo=" + mobileNo + "]";
	}
	
	
}
