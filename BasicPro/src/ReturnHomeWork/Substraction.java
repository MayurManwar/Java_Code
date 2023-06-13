package ReturnHomeWork;

public class Substraction {

	public int sub(int s) {
		Addition mayur = new Addition();
		int ma = mayur.Add(6, 8);

		int mn = ma - s;
		System.out.println(" Substraction of two number :" + mn);

		return mn;
	}

}
