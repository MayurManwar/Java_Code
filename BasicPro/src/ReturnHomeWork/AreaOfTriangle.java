package ReturnHomeWork;

public class AreaOfTriangle {

	public double area(int h) {

		AreaOfSquare g1 = new AreaOfSquare();
		double d1 = g1.area();

		double p2 = 0.5 * d1 * h;

		System.out.println("Area of  Triangle :" + p2);

		return p2;
	}
}
