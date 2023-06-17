package com.SelfStudy.CollegeManagementSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class NonTeachingStaff {

	
	private int id ;
	private  String Name;
	private String profile;
	private String mobile;
	private String retirementyear;
	private String joiningyear;
	private  String salary;
	
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
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "NonTeachingStaff [id=" + id + ", Name=" + Name + ", profile=" + profile + ", mobile=" + mobile + "]";
	}
	
	
	
}
