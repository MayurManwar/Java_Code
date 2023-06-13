package com.Project2;

public class Student {
	
private	int id;
 private String name;
 private String Dept;
 private  int mark;
 private int mobileNo;
 private String location;
 private String email;
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
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", Dept=" + Dept + ", mark=" + mark + ", mobileNo=" + mobileNo
			+ ", location=" + location + ", email=" + email + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", getDept()=" + getDept() + ", getMark()=" + getMark() + ", getMobileNo()=" + getMobileNo()
			+ ", getLocation()=" + getLocation() + ", getEmail()=" + getEmail() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

 
 
 

}
