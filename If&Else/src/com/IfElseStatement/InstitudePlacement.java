package com.IfElseStatement;

public class InstitudePlacement {

	public void placement(int per) {

		if (per >= 80) {

			System.out.println("JBK Is Excellent Placement  Institude.....!");

		}

		else {

			System.out.println("JBK Is Good Placement Institude.....!");
		}
	}

	public static void main(String[] args) {

		InstitudePlacement mayur = new InstitudePlacement();

		mayur.placement(60);
	}
}
