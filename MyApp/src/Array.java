
public class Array {
	public static void main (String[] args) {
//		int[] sales;
//		sales = new int[3];
//		sales[0] = 100;
//		sales[1] = 200;
//		sales[2] = 300;
		
//		int[] sales;
//		sales = new int[]{100, 200, 300};
//		System.out.println(sales[1]);
		
		int[] sales = {100, 200, 300};
//		for (int s = 0; s <sales.length; s++) {
//			System.out.println(sales[s]);
//		}
		for (int sale : sales) {
			System.out.println(sale);
		}
	}
}
