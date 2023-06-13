package HmOfGlobleVariable;

public class AreaOfCircle {

	int r=4;
	double PI=3.14;
	
	void area(){
		
		double area= PI*r*r;
		System.out.println("Area Of Circle :"+area);
	}
	
	
	public static void main(String[] args) {
		
		
		AreaOfCircle a= new AreaOfCircle();
				a.area();
	}
}
