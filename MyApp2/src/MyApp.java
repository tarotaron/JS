package src;
import src.model.User;
import src.model.AdminUser;
// import com.dotinstall.myapp.model.*; modelのした全て

public class MyApp {
	public static void main (String[] args) {
		User tom = new User("tom");
		// System.out.println(tom.name);
		tom.sayHi();

		AdminUser bob = new AdminUser("bob");
		// System.out.println(bob.name);
		bob.sayHi();
		bob.sayHello();
	}
}
