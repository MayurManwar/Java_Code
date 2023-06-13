package ReturnHomeWork;

public class Division {

	public int div(int r) {

		Mulitiplication m3 = new Mulitiplication();
		int mayu = m3.multi(4);

		int m5 = mayu / r;

		System.out.println("Division of two Number : " + m5);

		return m5;
	}

}
