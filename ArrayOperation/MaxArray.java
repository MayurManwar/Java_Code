package ArrayOperation;

public class MaxArray {

	
public static void main(String[] args) {
	
	int a[]={4,5,6,7,8,9};
	
	int maxnum=a[0];
	
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]>maxnum){
			
			
			maxnum=a[i];
			
			
		//	maxnum=a[i]-1; second large Array
			
		}
		
	}


	System.out.println("maximum Array >>> "+maxnum);
}


}
