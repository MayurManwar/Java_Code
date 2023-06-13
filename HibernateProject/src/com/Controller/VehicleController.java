package com.Controller;

import com.Entity.Vehicle;
import com.Service.VehicleService;

public class VehicleController {

	public void getvehicle() {

		VehicleService chiku = new VehicleService();
		Vehicle mayur = chiku.getvehicle();

	}

	public void updatevehicle() {

		Vehicle v = new Vehicle();
		v.setId(1);
		v.setName("Rx-100");
		v.setType("bike");

		VehicleService ee = new VehicleService();
		boolean check = ee.updatevehicle(v);

	}

	public void loadvehicle() {

		VehicleService m = new VehicleService();
		Vehicle mayur = m.loadvehicle();

		System.out.println(mayur);
	}

	

	public void deletevehicle() {

		Vehicle m = new Vehicle();
		m.setId(2);
		m.setName("bullet");
		m.setType("bike");

		VehicleService vs = new VehicleService();
		boolean bb = vs.deletevehicle(m);

	}
	
	public void savevehicle(){
		
		Vehicle k= new Vehicle();
		k.setId(4);
		k.setName("Scorpio");
		k.setType("car");
		
		VehicleService m= new VehicleService();
	boolean y=	m.savevehicle(k);
	
	}

	
}
