package com.IfElseStatement;

public class RoadSignal {

	public void signal(String colour) {

		if (colour == "red") {

			System.out.println("Stop a Vehicle Here....!");
		}

		else {

			System.out.println("Take a Vehicle away from here....! ");

		}
	}

	public static void main(String[] args) {

		RoadSignal mayur = new RoadSignal();
		mayur.signal("yellow");
	}
}
