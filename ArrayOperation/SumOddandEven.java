package ArrayOperation;

public class SumOddandEven {

	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		
	int	oddsum=0;
	
	int evensum=0;
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]%2==0){
		
			evensum=evensum+a[i];
		}else {
		
			oddsum=oddsum+a[i];
			
		}

	}
	System.out.println("odd sum>> "+oddsum);
	
System.out.println("evensum>>> "+evensum);	}
}
