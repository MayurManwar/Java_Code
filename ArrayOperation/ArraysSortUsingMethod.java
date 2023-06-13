package ArrayOperation;

import java.sql.Array;
import java.util.Arrays;

public class ArraysSortUsingMethod {

	public static void main(String[] args) {
		
		int a[]={35,8,43,9,12,5};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
