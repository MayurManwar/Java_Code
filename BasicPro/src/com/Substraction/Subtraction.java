package com.Substraction;

import com.Addition.Addition;

public class Subtraction {

	public int sub(int a) {

		Addition m2 = new Addition();
		int mayu = m2.add(5, 6, 7);
		
		int b2=mayu-a;

		System.out.println(" Substracion of two nubmer :" + b2);

		
		return b2;
	}
}
