package ArrayOperation;

public class CommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={2,5,6,7,12,8};
		int b[]={7,8,5,9,2,12,};
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				if(a[i]==b[j]){
					
					
					System.out.println("Common element>>> "+a[i]);
				}
				
			}
			
		}
		
	}

}
