package com.Mayur;

public class TestSuper extends TestThis {

	int s = 66;

	TestSuper(int r) {

		int a = super.a;

		double v = 3.14 * a * r;
		System.out.println(" by constructor..." + v);

	}

	void m2() {

		int d = this.s;
		int m = super.a;

		int mayur = m + d;

		System.out.println("by Method..." + mayur);

	}

	public static void main(String[] args) {

		TestSuper x = new TestSuper(5);

		x.m2();

	}

}
