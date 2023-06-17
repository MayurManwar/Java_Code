package com.AreaOfTriangle;

public class ConstructorOverloading {

	int value1;
	int value2;

	ConstructorOverloading() {

		value1 = 10;

		value2 = 20;

		System.out.println("Inside 1st Constructor");
	}

	ConstructorOverloading(int a) {

		value1 = a;
		System.out.println("Inside 2nd Constructor");

	}

	ConstructorOverloading(int a, int b) {

		value1 = a;
		value2 = b;

	}

	public void display() {
		System.out.println(" value1 =" + value1);
		System.out.println(" value2 =" + value2);

	}

	public static void main(String[] args) {

		ConstructorOverloading m1 = new ConstructorOverloading();
		ConstructorOverloading m2 = new ConstructorOverloading(30);
		ConstructorOverloading m3 = new ConstructorOverloading(30, 40);

		m1.display();

		m2.display();

		m3.display();
	}

}
