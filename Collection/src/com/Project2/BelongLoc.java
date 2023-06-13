package com.Project2;

import java.util.ArrayList;

public class BelongLoc {

	void m3() {

		System.err.println("Only Those Student Are  Having  Location Pune ");

		StudentInfo b = new StudentInfo();

		ArrayList<Student> n = b.m1();

		ArrayList<Student> m = new ArrayList<>();

		for (Student st : n) {

			if (st.getLocation() == "pune") {

				System.out.println(st.getName());

			}

		}

	}

}
