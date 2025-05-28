package code4_17;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		array = null;  // 配列のアドレスが消去
		array[0] = 10;  // 実行時エラー runtime error
		System.out.println(array[0]);
		// int a = null;
		// 基本データ型に null は代入できない。
	}

}
