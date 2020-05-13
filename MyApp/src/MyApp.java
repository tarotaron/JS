
public class MyApp {
	public static void main(String[] args) {
		int i;
		i = 10 / 3;
		System.out.println(i);
		i = 10 % 3;
		System.out.println(i);
		int x = 5;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		x = x +12;
		x += 12;
		System.out.println(x);
		
		String s;
		s = "hello" + "world";
		System.out.println(s);
		
		double d = 52343.231;
//		整数部分のみに変換
		int a = (int)d;
		System.out.println(a);
		
		int b = 10;
		double e = (double)b / 4;
		System.out.println(e);
	}
}
