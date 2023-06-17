package com.Jbk;

public class Mayur {

	int a;
	int b;

	Mayur() {

		a = 12;
		b = 21;
		System.out.println("Inside  Constructor");

	}

	public void test() {
		System.out.println("a===" + a);

		System.out.println("b====" + b);
	}

	public static void main(String[] args) {

		Mayur m = new Mayur();
		m.test();

	}

}
