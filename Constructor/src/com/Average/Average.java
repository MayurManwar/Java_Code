package com.Average;

public class Average {

	Average(int a, int b, int c) {

		 int d = a + b + c;

		double  mayur = d / 3;

		System.out.println("sum =" + d);

		System.out.println("Average = " + mayur);

	}

	public static void main(String[] args) {

		Average mayur = new Average(23, 32, 13);

	}

}
