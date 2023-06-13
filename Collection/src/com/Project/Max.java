package com.Project;

import java.util.ArrayList;

public class Max {

	void mm1() {

		int max = 0;
		Check mn = new Check();
		ArrayList<Ipl> jj = mn.m1();

		for (Ipl aa : jj) {

			if (aa.getTotalMatches() > max) {

				max = aa.getTotalMatches();

				System.err.println(aa.getCaptainName());

				System.out.println(" Is played more Matches than other Captain ");

			}

		}

	}

	public static void main(String[] args) {

		Max v1 = new Max();
		v1.mm1();

	}

}
