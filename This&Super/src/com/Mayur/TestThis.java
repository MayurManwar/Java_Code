package com.Mayur;

public class TestThis {

	int a = 4;

	TestThis() {
		int cc = this.a;
		int a = cc * 6;
		System.out.println("By Constructor : " + a);
	}

	void m1() {
		int ss = this.a;

		int aa = a + a;

		System.out.println("By Method ...: " + aa);
	}

	public static void main(String[] args) {

		TestThis mm = new TestThis();

		mm.m1();

	}
}
