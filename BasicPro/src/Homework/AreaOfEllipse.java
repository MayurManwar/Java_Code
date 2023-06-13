package Homework;

public class AreaOfEllipse {

void ellipse(int a ,int b)	 {
	
	double area= 3.14*a*b;
	
	System.out.println("area of Ellipse :" + area);
	
}
	public static void main(String[] args) {
	
		AreaOfEllipse e= new AreaOfEllipse();
		
		e.ellipse(5, 6);
		
	}
	
}
