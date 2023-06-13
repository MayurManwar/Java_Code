package com.Service;

import com.Entity.Vehicle;
import com.dao.VehicleDao;

public class VehicleService {

	public Vehicle getvehicle() {

		VehicleDao bb = new VehicleDao();
		Vehicle vl = bb.getvehicle();

		return vl;

	}

	public boolean updatevehicle(Vehicle v) {

		VehicleDao mm = new VehicleDao();

		return mm.updatevehicle(v);

	}

	public Vehicle loadvehicle() {

		VehicleDao cc = new VehicleDao();
		return cc.loadVehical();

	}

	public boolean deletevehicle(Vehicle m) {

		VehicleDao nn = new VehicleDao();

		return nn.deletevehicle(m);

	}

	public boolean savevehicle(Vehicle k) {
		
		VehicleDao z= new VehicleDao();
	return	z.savevehicle(k);
		
	}

	

	

	
}
