package ArrayOperation;

public class MinArray {
	
	public static void main(String[] args) {
		
	int a[]={44,3,22,23,78,65,99,};	
		
	int 	minnum=a[0];
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]<minnum){
			
			minnum=a[i];
			
		}
	}
		System.out.println("minnum Array>>> "+minnum);
	}

}
