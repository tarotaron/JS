class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class MyApp {
	public static void div(int a, int b) {
		try {
			if(b < 0) {
				throw new MyException("no minus!");
			}
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (MyException e) {
			System.err.println(e.getMessage());
			// 処理ができていなくても出力させる
		} finally {
			System.err.println("--end--");
		}
	}

	public static void main(String[] args) {
		div(3, 0);
		div(5, -2);
	}
}
