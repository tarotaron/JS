
public class repetition {
		public static void main(String[] args) {
		int score = 45;
		if (score > 80) {
			System.out.println("Great!");
		} else if (score > 60) {
			System.out.println("Good!");
		} else {
			System.out.println("so so ... !");
		}
		String msg = score > 80 ? "Greate!" : "so so ...!";
			System.out.println(msg);
			
		String signal = "pink";
		switch (signal) {
			case "red":
				System.out.println("stop!");
				break;
		//		二つの対象
			case "blue":
			case "green":
				System.out.println("go!");
				break;
			case "yellow":
				System.out.println("caution!");
				break;
			default:
				System.out.println("wrong signal!");
				break;
		}
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		int c = 0;
//		後判定の為一度は処理される
		do {
			System.out.println(c);
			c++;
		}	while (c < 10);
		
		for (int f = 10; f < 20; f++) {
			if (f == 15) {
//				処理停止
//				break;
//				指定条件を省いて処理
				continue;
			}
			System.out.println(f);
		}
	}
}
