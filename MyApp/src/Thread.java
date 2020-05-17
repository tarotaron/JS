class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print('*');
		}
	}
}

public class Thread {
	public static void main (String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 500; i++) {
			System.out.print('.');
		}

	}
}