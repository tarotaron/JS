
public class method {
//				void=何も返さないという意味
//	public static void sayHi(String name) {
	public static String sayHi(String name) {
//		System.out.println("hi!");
//		System.out.println("hi!" + name);
		return "Hi!" + name;
	}
	
	public static void main (String[] args) {
//		sayHi();
//		sayHi("Tom");
//		sayHi("Bob");
		String msg = sayHi("Steve");
		System.out.println(msg);
	}
}
