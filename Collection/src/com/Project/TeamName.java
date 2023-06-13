package com.Project;

import java.util.ArrayList;

public class TeamName {

	ArrayList<Ipl> m4() {

		Check bb = new Check();

		ArrayList<Ipl> a1 = bb.m1();

		ArrayList<Ipl> name = new ArrayList<Ipl>();

		for (Ipl m : a1) {

			System.out.println(m.getTeamName());

			name.add(m);
		}

		return name;
	}

}
