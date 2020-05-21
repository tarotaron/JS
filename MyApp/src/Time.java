import java.time.*;

public class MyApp {

	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.now();
		System.out.println(d.getYear());
		System.out.println(d.getManth());
		System.out.println(d.getManth().getValue());

		System.out.println(d.getManth(2).minuDays(3));

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
		System.out.println(d.format(dtf));

}