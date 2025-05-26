package code4_14;

public class Main {

	public static void main(String[] args) {
		
		int[] persons = new int[10];
		
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int value : scores) {
			sum = sum + value;
		}
		System.out.println("合計:" + sum);
		System.out.println("平均:" + sum / scores.length);
	}

}
