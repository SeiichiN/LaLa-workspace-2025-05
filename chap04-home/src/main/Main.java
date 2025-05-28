package main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] scores = {30, 20, 50, 10, 40};
		Arrays.sort(scores);
		for (int v : scores) {
			System.out.println(v);
		}
		
	}
}
