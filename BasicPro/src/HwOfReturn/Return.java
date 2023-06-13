package HwOfReturn;

public class Return {

	int  Add(int a, int b){
		
		int c=a+b;
		
		System.out.println("Addition of two number :"+ c);
		
		return c ;
	}
	
	
	int Sub(int s){
		
		Return a= new Return();  //return keyword means class name
		int d =a.Add(2, 3);
				
		int h= d-s;              //d=5
		
		System.out.println(" Subsraction of two number :"+ h);
		
		return h;
	}
	
	int Mult(int j){
		
		
		Return a= new Return();
	int	h=a.Sub(3);
		int v=h*j;                        //h=2
		
		System.out.println( "multipliction of two number :"+ v);
		
		
		return v;
	}
	
	
	int  Div (int q){
		
		Return a= new Return();
		int d=a.Mult(4);     
		
		int f= d/q;            //d=8
		
		System.out.println(" Division of two number :" + f);
		
		return f;
	}
	
	
	int avg(int x){
		
		Return a= new Return();	
		int g=a.Div(1);
		 int y=x+g;         //g=8
		 int z = y/2;
		
		System.out.println(" Average of two number :" + z);
		
		return z;
	}
	
	
	double areaOfCircle (){
		
		Return a= new Return();
		int p=a.avg(6);
		double n =3.14*p*p;  //p=7
		System.out.println( " Area Of circle :"+n);
		
		return n;
	}
	
	double AreaOfSquare(){
		
		Return a= new Return();
		double mn =a.areaOfCircle();
		
		double ma =mn*mn;       //mn=153.86
		
		System.out.println("Area Of Square : "+ma);
		
		return ma;
	}
	
	
	double AreaOfEllipse(){
		Return a= new Return();
		double aa=a.AreaOfSquare();     //aa=23672
		
		double mayur=3.14*aa*aa;
		
		System.out.println("Area Of Ellipse :"+ mayur);
		
		return mayur;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Return a= new Return();
		a.AreaOfEllipse();
		
		
		
	}
}
