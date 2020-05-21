import java.utl.Random;

public class MyApp {

	public static void main(String[] args) {
		double d = 53.234;
		System.out.println(Math.ceil(d));//小数点切り上げ
		System.out.println(Math.floor(d));//切り捨て
		System.out.println(Math.round(d));//四捨五入
		System.out.println(Math.PI(d));//円周率

		Random r = new Random();
		System.out.println(r.nextDouble());//0~1
		System.out.println(r.nextInt(100));//0~()までの整数
		System.out.println(r.nextBoolean());//true or false
	}
}