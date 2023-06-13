package com.Project;

import java.util.ArrayList;

public class Check {

	ArrayList<Ipl> m1() {

		Ipl m1 = new Ipl();

		m1.setTeamId(123);
		m1.setTeamName("Mumbai Indian");
		m1.setTeamState("Maharastra");
		m1.setCupWin(5);
		m1.setTotalMatches(321);
		m1.setCaptainName(" Rohit Sharma");

		Ipl m2 = new Ipl();

		m2.setTeamId(234);
		m2.setTeamName("Chennai Super King");
		m2.setTeamState("Tamilnadu");
		m2.setCupWin(4);
		m2.setTotalMatches(300);
		m2.setCaptainName(" M S Dhoni");

		Ipl m3 = new Ipl();

		m3.setTeamId(345);
		m3.setTeamName("Royal Challenger Bengluru");
		m3.setTeamState("Karnathak");
		m3.setCupWin(0);
		m3.setTotalMatches(309);
		m3.setCaptainName("Virat kohli");

		Ipl m4 = new Ipl();

		m4.setTeamId(456);
		m4.setTeamName("Delhi Capital");
		m4.setTeamState("Delhi");
		m4.setCupWin(1);
		m4.setTotalMatches(311);
		m4.setCaptainName("Rishabh Pant");

		Ipl m5 = new Ipl();

		m5.setTeamId(567);
		m5.setTeamName("Rajastan Royal");
		m5.setTeamState("Rajastan");
		m5.setCupWin(1);
		m5.setTotalMatches(234);
		m5.setCaptainName("Sanju Samson");

		ArrayList<Ipl> list = new ArrayList<>();

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		for (Ipl bb : list) {
		//	System.out.println(bb);

		}

		return list;

	}

}
