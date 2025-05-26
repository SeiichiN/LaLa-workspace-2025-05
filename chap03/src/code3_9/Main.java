package code3_9;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
