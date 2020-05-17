class User {
	private String name;
	private static int count = 0;

// staticイニシャライザ=クラスを使う前の初期化処理 一度だけ処理
	static {
		User.count = 0;
		System.out.println("Static initializer");
	}

	// 	インスタンスイニシャライザ=インスタンス化される前に毎回処理される
	// Constructorよりも先に走る
	{
		System.out.println("Instance initializer");
	}

	public User(String name) {
		this.name = name;
		User.count++;
		System.out.println("Constructor initializer");
	}
	public static void getInfo() {
		System.out.println("# of instances:" + User.count);
	}
}

public class Initializer{

	public static void main(String[] args) {
		User.getInfo();
		User tom = new User("tom");
		User.getInfo();
		User bob = new User("bob");
		User.getInfo();
	}
}
