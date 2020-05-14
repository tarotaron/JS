class User {
	String name = "Me!";
	void sayHi() {
		System.out.println("hi!");
	}
}

public class Class {
	public static void main (String[] args) {
		User tom;
		tom = new User();//インスタンス 
		System.out.println(tom.name);
		tom.sayHi();
	}
}
