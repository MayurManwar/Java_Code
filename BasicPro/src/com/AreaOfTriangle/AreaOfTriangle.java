package com.AreaOfTriangle;

import com.AreaOfSquare.AreaOfSquare;

public class AreaOfTriangle {

	public double area(int a) {

		AreaOfSquare j5 = new AreaOfSquare();

		double gh = j5.area();
		double pp = 0.5 * gh * a;

		System.out.println("Area Of Triangle : " + pp);

		return pp;
		
		
	}

}
