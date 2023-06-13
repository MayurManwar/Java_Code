package Homework;

public class DiscountOnProduct {

void discount(int original, int per){
		
		
		
		double dis = original * per/ 100;
		double selling = original-dis;
		
		System.out.println("original price : "  + original);
		System.out.println("dis percentace : " + per +"%");
		System.out.println("selling price : " + selling);
		
	}

public static void main(String[] args) {
	
	
	DiscountOnProduct d =new DiscountOnProduct();
	d.discount(10000, 20);
}
}
