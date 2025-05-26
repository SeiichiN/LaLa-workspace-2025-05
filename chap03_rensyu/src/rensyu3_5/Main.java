package rensyu3_5;

public class Main {

	public static void main(String[] args) {
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");
		String selTxt = new java.util.Scanner(System.in).nextLine();
		int selected = Integer.parseInt(selTxt);
		switch (selected) {
		case 1 -> { System.out.println("検索します"); }
		case 2 -> { System.out.println("登録します"); }
		case 3 -> { System.out.println("削除します"); }
		case 4 -> { System.out.println("変更します"); }
		}
		String msg = switch (selected) {
		case 1 -> "検索します";
		case 2 -> "登録します";
		case 3 -> "削除します";
		case 4 -> "変更します";
		default -> "";
		};
		System.out.println(msg);
				
	}

}
