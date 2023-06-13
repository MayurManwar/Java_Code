package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Vehicle {
	
	
private	int id;
private	String name;
private	String type;


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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Vehicle [id=" + id + ", name=" + name + ", type=" + type + "]";
}
 
	

}
