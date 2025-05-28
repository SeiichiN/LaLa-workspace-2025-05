package main;

public class Main {

	public static void main(String[] args) {
		String[] hand = {"グー", "チョキ", "パー"};
		while(true) {
			int comHand = new java.util.Random().nextInt(3);
			System.out.print("0:グー 1:チョキ 2:パー 9:終わり> ");
			String userTxt = new java.util.Scanner(System.in).nextLine();
			int userHand = Integer.parseInt(userTxt);
			if (userHand == 9) {
				break;
			}
			String result = "";
			if (userHand == comHand) {
				result = "あいこです";
			} else if ((userHand+1) % 3 == comHand) {
				result = "ユーザーの勝ちです";
			} else {
				result = "わたしの勝ちです";
			}
			System.out.print("わたし:" + hand[comHand]);
			System.out.println(" あなた:" + hand[userHand]);
			System.out.println(result);
		}
		System.out.println("終わります");
	}

}
