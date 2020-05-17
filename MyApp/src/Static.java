// static=インスタンス化しなくてもクラスを使用できる
class User {
	private String name;
	private static int count = 0;

	public User(String name) {
		this.name = name;
		User.count++;
	}
	public static void getInfo() {
		System.out.println("# of instances:" + User.count);
	}
}

public class Static{

	public static void main(String[] args) {
		User.getInfo();
		User tom = new User("tom");
		User.getInfo();
		User bob = new User("bob");
		User.getInfo();
	}
}
