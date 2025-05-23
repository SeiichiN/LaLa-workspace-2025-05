package p111;

public class Main {

	public static void main(String[] args) {
		System.out.print("animal >");
		String animal = 
				new java.util.Scanner(System.in).nextLine();
		if (animal.equals("dog")) {
			System.out.println("犬です");
		} else {
			System.out.println("犬ではない");
		}

	}

}
