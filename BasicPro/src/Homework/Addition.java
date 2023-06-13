package Homework;

public class Addition {
	
	
	void add(int a, int b,int c){
		
	int mayur= a+b+c;	
		
		System.out.println(" Addition of Three number : " +mayur);
	}

	public static void main(String[] args) {
		
		
		Addition a= new Addition();
		a.add(10, 5, 15);
	}
}
