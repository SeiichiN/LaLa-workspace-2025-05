package code5_13;

public class Main {

	public static void incArray(int[] array) {
		/* 配列の中身を別の変数に代入して取り出している
		 * 拡張for文は、読み取り専用
		for (int v : array) {
			v++;
		}
		*/
		// returnなしでも配列の変更ができる
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
