package code3_6;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		String s = switch (fortune) {
			case 1 -> "大吉";
			case 2 -> "中吉";
			case 3 -> "吉";
			default -> "凶";
		};
		System.out.println("運勢は" + s);
	}

}
