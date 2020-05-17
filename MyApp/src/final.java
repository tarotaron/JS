// foinal=変更不可
// クラスにつけると継承できなくなる
// メソッドにつけるとoverrideできなくなる
final class User {
	protected String name;
	private static final double VERSION = 1.1;

	User(String name) {
	this.name = name;
	User.ERSION = 1.2;
	}

	public final void sayHi() {
	System.out.println("hi! " + this.name);
	}
}

class AdminUser extends User {

	AdminUser(String name) {
	super(name);
	}

	void sayHello() {
	System.out.println("hello! " + this.name);
	}

	// override
	@Override
	void sayHi() {
	System.out.println("[admin] hi! " + this.name);
	}
}

public class Final {

	public static void main(String[] args) {
	User tom = new User("tom");
	System.out.println(tom.name);
	tom.sayHi();

	AdminUser bob = new AdminUser("bob");
	System.out.println(bob.name);
	bob.sayHi();
	bob.sayHello();
	}

}