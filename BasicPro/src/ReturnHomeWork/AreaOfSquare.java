package ReturnHomeWork;

public class AreaOfSquare {

	public double area() {

		AreaOfCircle v1 = new AreaOfCircle();

		double c1 = v1.area();
		double c2 = c1 * c1;
		System.out.println("Area Of Square : " + c2);

		return c2;

	}

}
