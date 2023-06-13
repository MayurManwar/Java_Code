package com.hashmapEx;

import java.util.ArrayList;
import java.util.HashMap;

public class IndiaProject {
public static void main(String[] args) {
	

/*	india --> maha, gujrat,mp delhi;
	maha --> mumbai, pune ,nagpur;
	gujrat --> surat, gandhinagar, rajkot;
	delhi -->
	mp --> indor,bhopal;
	*/
	
	
	ArrayList<String> mh= new ArrayList<>();
	mh.add("Mumbai");
	mh.add("Pune");
	mh.add("Nagpur");
	mh.add("Nashik");
	
	
	ArrayList<String> guj= new ArrayList<>();
	guj.add("Surat");
	guj.add("Gandhinagar");
	guj.add("Rajkot");
	
	
	ArrayList<String> delhi= new ArrayList<>();
	
	ArrayList<String> mp= new ArrayList<>();
	
	mp.add("Bhopal");
	mp.add("Indor");
	
	HashMap<String, ArrayList<String>> state= new HashMap<>();
	
	state.put("Mp", mp);
	state.put("Maha", mh);
	state.put("Guj", guj);
	state.put("Delhi", delhi);
	
	
	HashMap<String , HashMap<String, ArrayList<String>>> contry = new HashMap<>();
	
	contry.put("India", state);
	
	
	
	for (String mm : contry.keySet()) {
		System.out.println(mm);
		System.out.println(contry.get(mm));
	
		
	}
}
}











