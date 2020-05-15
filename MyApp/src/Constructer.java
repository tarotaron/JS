class Member {
	String name;
	
	Member(String name) {
		this.name = name;
	}
	
	Member() {
		this.name = "Me";
	}
	void sayHi() {
		System.out.println("hi!" + this.name);
	}
}

public class Constructer {
	public static void main (String[] args) {
		Member tom;
		tom = new Member(); 
		System.out.println(tom.name);
		tom = new Member("suzu"); 
		System.out.println(tom.name);
		tom.sayHi();
	}
}
