package code6_10;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 191, 155};
		Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
