package Homework;

public class Percentage {

	
	void per (int a, int b, int c){
		
		int total =300;
		int  sum  = a+ b + c;
		double mayur =sum/total;
	double per = mayur *100;
		
		System.out.println(" Percentage: "+per);
	}
	
	public static void main(String[] args) {
		
		
		Percentage p =new Percentage();
		p.per(67, 89, 92);
	}
}
	
