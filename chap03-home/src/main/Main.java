package main;

public class Main {

	public static void main(String[] args) {
		int comHand = new java.util.Random().nextInt(3);
		System.out.print("0:グー 1:チョキ 2:パー > ");
		String userTxt = new java.util.Scanner(System.in).nextLine();
		int userHand = Integer.parseInt(userTxt);
		String result = "";
		if (userHand == comHand) {
			result = "あいこ";
		} else if ((userHand + 1) % 3 == comHand) {
			result = "あなたの勝ち";
		} else {
			result = "わたしの勝ち";
		}
		System.out.print("あなた：" + userHand);
		System.out.println("　わたし：" + comHand);
		System.out.println(result);
	}

}
