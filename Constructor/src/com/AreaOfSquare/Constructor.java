package com.AreaOfSquare;

public class Constructor {

	Constructor() {

		System.out.println("Running Process");
	}

	Constructor(int a) {
		System.out.println("Inside Value = " + a);
	}

	public static void main(String[] args) {

		Constructor mayur = new Constructor();

		Constructor mayur1 = new Constructor(8);
	}

}
