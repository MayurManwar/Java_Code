package com.AreaOfEllipse;

import com.AreaOfTriangle.AreaOfTriangle;

public class AreaOfEllipse {

	public double area(int s) {

		AreaOfTriangle tt = new AreaOfTriangle();

		double rr = tt.area(3);
		double t4 = 3.14 * rr * s;

		System.out.println(" Area Of Ellipse : " + t4);

		return t4;

	}

}
