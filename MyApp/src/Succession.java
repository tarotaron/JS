class Users {
	private String name;
	private int score;
	
	Users(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		if (score > 0) {
			this.score = score;
	}
	
//	
// 	void sayHi() {
//		System.out.println("hi!" + this.name);
//	}
}

//class AdminUser extends Users {
//	AdminUser(String name) {
//		super(name);
//	}
//	void sayHello() {
//		System.out.println("hello!" + this.name);
//	}
//	//override
//	@Override
//	void sayHi() {
//		System.out.println("[admin]hi!" + this.name);
//	}

}

public class Succession {
	public static void main (String[] args) {
		Users tom = new Users("tom", 65);
		tom.setScore(85);
		tom.setScore(-22);
	    System.out.println(tom.getScore());
//	    tom.sayHi();
		
//	    AdminUser bob = new AdminUser("bob");
//	    System.out.println(bob.name);
//	    bob.sayHi();
//	    bob.sayHello();
	}
}

