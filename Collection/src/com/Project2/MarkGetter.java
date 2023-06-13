package com.Project2;

import java.util.ArrayList;

public class MarkGetter {

	void m2() {

		System.err.println("Only Those Student Whose Mark is Getter than 60");
		
		
		
		StudentInfo mm = new StudentInfo();
		ArrayList<Student> vv = mm.m1();

		ArrayList<Student> bb = new ArrayList<>();

		for (Student mn : vv) {

			if (mn.getMark() >= 60) {

				System.out.println(mn);

			}

		}

	}

}
