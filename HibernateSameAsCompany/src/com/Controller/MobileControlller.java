package com.Controller;

import java.util.List;

import com.Entity.Mobile;
import com.Service.MobileService;

public class MobileControlller {

	/*
	 * ...........................................criteria
	 * method........................................
	 */

	public void equalmobile() {

		MobileService mayur = new MobileService();
		List<Mobile> ma = mayur.equalmobile();

	}

	public void lessthanmobile() {

		MobileService chiku = new MobileService();
		List<Mobile> ch = chiku.lessthanmobile();
	}

	public void greaterthanmobile() {

		MobileService shru = new MobileService();

		List<Mobile> sh = shru.greaterthanmobile();
	}

	public void likemoblile() {

		MobileService nik = new MobileService();

		List<Mobile> n = nik.likemobile();
	}

	/*
	 * ......................................Projection
	 * method......................................
	 */
	public void maxmobile() {

		MobileService mm = new MobileService();

		List<Mobile> mayur = mm.maxmobile();

	}

	public void countmobile() {

		MobileService mm = new MobileService();

		List<Mobile> chiku = mm.countmobile();

	}

	public void minmobile() {

		MobileService mm = new MobileService();

		List<Mobile> mayu = mm.minmobile();
	}

	public void summobile() {

		MobileService mm = new MobileService();

		List<Mobile> shru = mm.summobile();
	}

	public void avgmobile() {

		MobileService mm = new MobileService();
		List<Mobile> nik = mm.avgmobile();
	}

	public void rowcountmobile() {

		MobileService mm = new MobileService();

		List<Mobile> mayur = mm.rowcountmobile();
		System.out.println(mayur);
	}

	public static void main(String[] args) {

		MobileControlller mm = new MobileControlller();

		mm.rowcountmobile();
	}
}
