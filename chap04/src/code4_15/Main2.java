package code4_15;

public class Main2 {

	// 配列のコピー
	public static void main(String[] args) {
		int[] arrayA = {10, 20, 30};
		int[] arrayB = new int[3];
		for (int i = 0; i < arrayA.length; i++) {
			arrayB[i] = arrayA[i];
		}
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}

}
