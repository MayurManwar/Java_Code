package Homework;

public class Multiplication {

	
	void mult(int a , int b,int c){
		
		
		int mayur = a*b*c;
		System.out.println(" Multipliction of three number : " + mayur);
	}
	
	public static void main(String[] args) {
		
		
		Multiplication m =new Multiplication();
		
		m.mult(4, 5,2);
	}
}
