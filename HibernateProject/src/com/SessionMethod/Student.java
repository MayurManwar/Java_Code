package com.SessionMethod;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	
	
private	int id;
private String name;
private String mark;

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
public String getMark() {
	return mark;
}
public void setMark(String mark) {
	this.mark = mark;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getMark()=" + getMark() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
	






}
