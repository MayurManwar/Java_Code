package com.Project;

import java.util.ArrayList;

public class WinMoreThan2 {

	ArrayList<Ipl> m5() {

		Check vv = new Check();

		ArrayList<Ipl> nn = vv.m1();

		ArrayList<Ipl> team = new ArrayList<Ipl>();

		for (Ipl b : nn) {

			if (b.getCupWin() >= 2) {

				System.out.println(b);

			}

		}

		return team;
	}

}
