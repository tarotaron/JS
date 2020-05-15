class User{
	String name;
	
	User(String name) {
		this.name = name;
	}
	
	User() {
		this.name = "Me";
	}
	void sayHi() {
		System.out.println("hi!" + this.name);
	}
}

class AdminUser extends User {
	AdminUser(String name) {
		super(name);
	}
	void sayHello() {
		System.out.println("hello!" + this.name);
	}

}

public class Succession {
	public static void main (String[] args) {
		User tom = new User(); 
		System.out.println(tom.name);
		tom = new User(); 
		System.out.println(tom.name);
		tom.sayHi();
		
		AdminUser bob 
		bob = new AdminUser(); 
		System.out.println(bob.name);
		bob.sayHi();
		bob.sayHello();
	}
}

