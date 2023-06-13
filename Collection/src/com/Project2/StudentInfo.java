package com.Project2;

import java.util.ArrayList;

public class StudentInfo {

	ArrayList<Student> m1() {

		Student s1 = new Student();
		s1.setId(111);
		s1.setName("Mayur");
		s1.setLocation("Pune");
		s1.setMark(90);
		s1.setDept("Mech");
		s1.setMobileNo(98768778);
		s1.setEmail("mayurmanwar1998@gmail.com");

		Student s2 = new Student();
		s2.setId(222);
		s2.setName("Nikita");
		s2.setLocation("Mumbai");
		s2.setMark(80);
		s2.setDept("Computer");
		s2.setMobileNo(98768332);
		s2.setEmail("nikmayur@gmail.com");

		Student s3 = new Student();
		s3.setId(333);
		s3.setName("Swaraj");
		s3.setLocation("nagpur");
		s3.setMark(76);
		s3.setDept("Civil");
		s3.setMobileNo(768778);
		s3.setEmail("swarajh@gmail.com");

		Student s4 = new Student();
		s4.setId(4443);
		s4.setName("Amit");
		s4.setLocation("latur");
		s4.setMark(30);
		s4.setDept("Entc");
		s4.setMobileNo(7768778);
		s4.setEmail("amitKhadse@gmail.com");

		Student s5 = new Student();
		s5.setId(555);
		s5.setName("Rahul");
		s5.setLocation("ghule");
		s5.setMark(55);
		s5.setDept("Electical");
		s5.setMobileNo(987778);
		s1.setEmail("Rahhul1998@gmail.com");

		Student s6 = new Student();
		s6.setId(666);
		s6.setName("Prashant");
		s6.setLocation("Amravati");
		s6.setMark(58);
		s6.setDept("Auto");
		s6.setMobileNo(787666);
		s6.setEmail("prasanttt5@gmail.com");

		ArrayList<Student> al = new ArrayList<>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);

		for (Student s : al) {

			// System.out.println(s);

		}

		return al;

	}

}
