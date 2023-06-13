package com.Service;

import java.util.List;

import com.Dao.MobileDao;
import com.Entity.Mobile;

public class MobileService {

	/* .........Criteria and Projection method..... */

	public List<Mobile> equalmobile() {

		MobileDao mayur = new MobileDao();

		return mayur.equalmobile();

	}

	public List<Mobile> lessthanmobile() {

		MobileDao chiku = new MobileDao();

		return chiku.lessthanmobile();

	}

	public List<Mobile> greaterthanmobile() {

		MobileDao shru = new MobileDao();

		return shru.greaterthanmobile();
	}

	public List<Mobile> likemobile() {

		MobileDao nik = new MobileDao();
		return nik.likemobile();
	}

	public List<Mobile> betweenmobile() {

		MobileDao mayu = new MobileDao();

		return mayu.betweenmobile();
	}

	/*
	 * ............................................Projection
	 * Method...................................................
	 */

	public List<Mobile> countmobile() {

		MobileDao bb = new MobileDao();
		return bb.countmobile();
	}

	public List<Mobile> maxmobile() {
		MobileDao mm = new MobileDao();

		return mm.maxtmobile();
	}

	public List<Mobile> summobile() {

		MobileDao m = new MobileDao();
		return m.summobile();
	}

	public List<Mobile> minmobile() {
		MobileDao b = new MobileDao();
		return b.minmobile();
	}

	public List<Mobile> avgmobile() {
		MobileDao cc = new MobileDao();
		return cc.avgmobile();

	}

	public List<Mobile> rowcountmobile() {

		MobileDao mm = new MobileDao();
		return mm.rowcountmobile();
	}

}
