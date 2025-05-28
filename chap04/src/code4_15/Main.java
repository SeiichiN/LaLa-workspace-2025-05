package code4_15;

public class Main {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB = arrayA;  // アドレスのコピー
		
		arrayB[0] = 100;
		for (int v : arrayA) {
			System.out.println(v);
		}
	} // main() end
	
	public static void fukusyu() {
		int[] seiseki = new int[5];
		seiseki[0] = 10;
		seiseki[1] = 20;
		seiseki[2] = 40;
		seiseki[3] = 50;
		seiseki[4] = 80;
		int[] tensu = {10, 20, 40, 50, 80};
		int[] tensu2 = new int[] {10, 20, 40, 50, 80};
		
		for (int v : seiseki) {
			System.out.println(v);
		}
	}

} // class end
