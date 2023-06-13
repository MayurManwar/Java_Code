package ArrayOperation;

public class SeperateOddandEvenArray {

	public static void main(String[] args) {
		
		int a[]={22,12,3,44,5};
		
		int countOdd=0;
		int countEven=0;
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			if(a[i]%2==0){
				countEven++;
			}
			else{
				countOdd++;
			}
		}
		
		int arrayodd[]=new int[countOdd];
		int arrayeven[]=new int[countEven];
		
		int indexodd=0;
		int indexeven=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0){
				
				arrayeven[indexeven]=a[i];
				indexeven++;
			}
			else{
				arrayodd[indexodd]=a[i];
				indexodd++;
			}
		}
		
		
		System.out.println("even number fromArray>>>");
		
		for (int i = 0; i < arrayeven.length; i++) {
			System.out.println(arrayeven[i]);
		}
		
		System.out.println("odd number fromArray>>>");
		for (int i = 0; i <	arrayodd.length; i++) {
			System.out.println(	arrayodd[i]);
		}
	}

}
