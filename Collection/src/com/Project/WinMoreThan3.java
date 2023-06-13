package com.Project;

import java.util.ArrayList;

public class WinMoreThan3 {

	ArrayList<Ipl> m3() {

		Check bb = new Check();
		ArrayList<Ipl> mb = bb.m1();

		ArrayList<Ipl> m7 = new ArrayList<>();

		for (Ipl mayur : mb) {

			if (mayur.getCupWin() > 3) {

				System.out.println(mayur.getTeamName());

				System.out.println(mayur.getTeamState());

			}

		}
		return m7;

	}

	public static void main(String[] args) {

		WinMoreThan3 nn = new WinMoreThan3();

		nn.m3();

	}

}
