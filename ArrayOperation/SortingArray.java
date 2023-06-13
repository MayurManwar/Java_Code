package ArrayOperation;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 33, 4, 55, 6, 7, 8 };

		int tem = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}

			}

			System.out.println(a[i]);
		}

	}
}