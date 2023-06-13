package com.Project2;

import java.util.ArrayList;

public class NotBelongPuneOrMumbai {

	void m7() {

		System.err.println("Only Those Student Having Not Belong Computer & mech");

		StudentInfo b = new StudentInfo();
		ArrayList<Student> mn = b.m1();

		ArrayList<Student> s = new ArrayList<>();

		for (Student st : mn) {

			if (st.getLocation() != "Pune" && st.getLocation() != "Mumbai") {

				System.out.println(st.getLocation());
			}
		}

	}

	public static void main(String[] args) {
		NotBelongPuneOrMumbai n = new NotBelongPuneOrMumbai();
		n.m7();
	}

}
