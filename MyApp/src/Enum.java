enum Result {
	SUCCESS,
	ERROR,
}

public class Enum {
	public static void main(String[] args) {
		Result res;
		res = Result.ERROR;

		switch (res) {
			case SUCCESS:
				System.out.println("OK!");
				// ordinal=enumは連番がふられる
				System.out.println(res.ordinal());
				break;
			case ERROR:
				System.out.println("NG!");
				System.out.println(res.ordinal());
				break;
		}
	}
}