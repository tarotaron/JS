import java.util.*;

public class MyApp {

	public static void main(String[] args) {
		// データ重複× 順番がバラバラ
		// HashSet<Integer> sales = new HashSet<>();
		Set<Interger> sales = new HashSet<>();
		sales.add(10);
		sales.add(20);
		sales.add(30);
		sales.add(10);
	
		System.out.println(sales.sise());

		for(Interger sale : sales) {
			System.out.println(sale);
		}

		sales.remove(30);

		for(Interger sale : sales) {
			System.out.println(sale);
		}
	}
}