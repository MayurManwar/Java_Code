package com.AreaOfCircle;

import com.Division.Division;

public class AreaOfCircle {

	public double area() {

		Division k2 = new Division();

		int y2 = k2.div(8);

		double hh = 3.14 * y2 * y2;
		System.out.println(" Area Of Circlr : " + hh);

		return hh;

	}

}
