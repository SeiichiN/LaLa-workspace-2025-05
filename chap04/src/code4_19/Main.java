package code4_19;

public class Main {

	public static void main(String[] args) {
		int[][] scores = {
				{40, 50, 60},
				{80, 60, 80},
				{35, 45, 20},
		};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		
		for (int[] row : scores) {
			for (int v : row) {
				System.out.println(v);
			}
		}

	}

}
