package ReturnHomeWork;

public class AreaOfEllipse {

	public void area(int s) {

		AreaOfTriangle x1 = new AreaOfTriangle();
		double b2 = x1.area(7);

		double mayur = 3.14 * b2 * s;

		System.out.println("Area of Ellipse: " + mayur);

	}

	public static void main(String[] args) {

		AreaOfEllipse mm = new AreaOfEllipse();
		mm.area(4);

	}
}
