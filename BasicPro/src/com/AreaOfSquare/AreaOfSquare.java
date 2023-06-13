package com.AreaOfSquare;

import com.AreaOfCircle.AreaOfCircle;

public class AreaOfSquare {
	
	public double area (){
		
		AreaOfCircle gg= new AreaOfCircle();
		
		double hh= gg.area();
		
		double dd =hh*hh;
		System.out.println("Area of Square : "+ dd);
		
		return dd;
		
		
	}
	
	

}
