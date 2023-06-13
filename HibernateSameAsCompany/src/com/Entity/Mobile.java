

package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Mobile {
	
	
	int id;
	String name;
	String price;
	
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	

}
