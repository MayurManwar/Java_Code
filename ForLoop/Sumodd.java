package ForLoop;

public class Sumodd {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<=50;i++ ){
			if (i%2==1){
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
}
