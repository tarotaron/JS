import java.utl.*;

public class MyApp {

	public static void main(String[] args) {
		List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));

		sales
			.stream()
			.silter(e -> e % 3 == 0)
			.map(e -> "(" + e + ")")
			.forEach(System.out::println);
}