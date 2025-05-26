package main;

public class Main {

	public static void main(String[] args) {
		
		String[] fortune = {"大吉", "中吉", "吉", "凶"};
		int num = new java.util.Random().nextInt(fortune.length);
		System.out.println("運勢は、" + fortune[num] + "です");
	}	
	

}
