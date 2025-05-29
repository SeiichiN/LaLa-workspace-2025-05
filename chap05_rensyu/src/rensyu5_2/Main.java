package rensyu5_2;

public class Main {

	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		String title = "名前をつけました";
		String address = "abc123@example.com";
		String text = "寿限無寿限無五項の擦り切れ";
		email(address, text);
	}

}
